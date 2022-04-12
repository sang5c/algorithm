SELECT C.name AS customers
FROM customers AS C
LEFT JOIN orders AS O ON C.id = O.customerid
WHERE O.id IS NULL
