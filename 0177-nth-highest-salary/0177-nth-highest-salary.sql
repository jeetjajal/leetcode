CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare M int;
  SET m = n - 1; 
  RETURN (
      # Write your MySQL query statement below.
select (
        select distinct salary 
        from employee
        order by salary desc
        limit 1 OFFSET m
  )
    as secondhighestsalary
);
END