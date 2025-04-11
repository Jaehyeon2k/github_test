2025.03.31
# 오늘날짜
SELECT sysdate FROM dual;
SELECT sysdate+1, sysdate-2 
FROM dual;
SELECT sysdate+1, sysdate-2 
FROM y_emp;
SELECT sysdate+1/24, sysdate+2/24 
FROM dual;
ALTER SESSION SET 
nls_date_format=’yyyy/mm/dd hh24:mi:ss’;
SELECT sysdate FROM dual;

SELECT *
FROM y_emp
WHERE emp_name >= ‘송강호’;

SELECT *
FROM y_emp
WHERE hiredate = ‘01/03/19’;

SELECT emp_id, emp_name, salary, 
               salary*12 AS ann_sal
FROM y_emp
WHERE salary*12 > 8000;

-- 4월 7일
select *
from y_emp;

SELECT emp_id, emp_name, position, dept_id
from y_emp
where dept_id is null;

SELECT emp_id, emp_name, comm
from y_emp
where comm is not null;

SELECT emp_id, emp_name, position, dept_id
FROM y_emp
WHERE position = '사원' and dept_id = 400;

SELECT emp_id, emp_name, position, dept_id
FROM y_emp
WHERE position = '사원' or dept_id = 400;

SELECT emp_id, emp_name, position, dept_id
FROM y_emp
WHERE position not in ('과장','대리','사원');

SELECT emp_name, position, salary
FROM y_emp
WHERE position = '차장' or position = '부장'
and salary > 700;

SELECT emp_name, position, salary
FROM y_emp
WHERE position in ('차장', '부장')
and salary >= 700;

SELECT emp_name, position, salary
FROM y_emp
WHERE (position = '차장' or position = '부장')
and salary >= 700;

SELECT emp_name, position, dept_id, hiredate
from y_emp
order by hiredate;

SELECT emp_name, position, dept_id, hiredate
from y_emp
order by hiredate desc;


SELECT emp_name, position, dept_id, salary
from y_emp
order by dept_id, salary desc;

select emp_id, emp_name, salary * 12 annsal
from y_emp
order by annsal desc;

select emp_id, emp_name, salary * 12 annsal
from y_emp
order by 3  desc;

select emp_id, emp_name, position, dept_id
from y_emp
where emp_name like '%승%'; 
