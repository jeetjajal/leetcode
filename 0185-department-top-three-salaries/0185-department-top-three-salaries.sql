select Department, Employee, Salary
from( SELECT
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER(
            PARTITION BY e.departmentId
            ORDER BY e.salary DESC
        ) AS rnk
    from Employee e
    join Department d
    on e.departmentId = d.id
) t
WHERE rnk <= 3;