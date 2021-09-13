# Book Shelf Manager

## For those who still read...!

###ABOUT:

This is a simple persistance terminal application for anyone, to manage the books that they have posession of.

* The basic concept of this application, to make users able to preform CRUD operations (create, read, update, delete) on their bookshelves content (or library, since I assume you read way more than other people if you end up using this product).
* The mentioned actions can be both preformed regarding books and authors alike!


###WARNING!

* This is not an eyecandy project -> this app won't rob your reading time with flashy pop-ups!
* It has a simplified view layer design avaliable in terminal, with clear instructions and menu options!

###General Overview :

* This project is created in Java 11 SE, with the usage of Postgre SQL relational database used for persisting your library information. The link between the layers is created with JDBC.

### How to use:

* First you need Posgre s SQL on your system, if you don't have it already follow you can downloade it from [here](https://www.postgresql.org/download/), the instructions in this [video](https://www.youtube.com/watch?v=d--mEqEUybA) will help you to get started.
* In the next step you will need to open the project in your favourite IDE (Integrated Development Environment), I'll advise using IntelliJ (as always if needed you can download it from [here](https://www.jetbrains.com/idea/download/#section=windows), also here is some handy [video](https://www.youtube.com/watch?v=9A425SE59SQ) for you to install the essentials for the project)
* If the previous step is completed :  navigate to books.sql and run it either after you set up database connection in your IDE, or from terminal/command line. Remember: you NEED to be connected to one of your OWN database! 
* As the final step, you will need to navigate to the BookDbManager, and fill out the required data between the "_______" as follows:
<br>
	* dataSource.setDatabaseName("__________");  -> your database name (in which you have run the Books.sql file)
<br>
        * dataSource.setUser("________");            -> your database user name 
<br>
	* dataSource.setPassword("___________");     -> your very secret password
<br>
* Save the changes, reload maven if needed, run the application, read a lot, and maintain your book shelves up to date!

### Terms of use:

This is an open source project, feel free to integrate it into your project, or use it for your own benefit!


