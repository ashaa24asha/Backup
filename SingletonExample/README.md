What is Singleton

Singleton class means the class which is allowed to create only one object is nothing but a singleton class.
Singleton class is such a class which can provide you only one instance or a single object throughout the whole life cycle of that particular class
 if you try to create another object it will point you to the same previous instance which was initially created so that means you can only have only one instance in this particular class .
That means It restricts the unneccessary creation of an objects.
It uses the existing object instead of ceating new object so because of this it saves memory.


Real time example:
We need to find the scope of such objects which needs to be initialized only one in an application
Like every application follows a log process so we initialize the log classes and then the logs get written in the log file,
In every class we initiliaze the logging process right so if we every time if we create a new object of the log class  that is gonna consume lot of memory which is not required.
Because we can use the same logger instance in every class and write our logs so that is the way,that is the best use of Singleton class.

Another use:
In every Service layer we used to utilize the DAO interface to fetch all the data from the database.
Now lets say we have one Address DAO which is responsible for building many objects.
Lets say In a system we have Patients,Hospitals and Doctors,everybody has address
Like Patients has Address,Hospitals has and Doctors as well has.
So In every service lets say Patient Service,Hospital Service and Doctors Hospital we are gonna call the Address DAO
and we don't want to create new instances of Address DAO we can use the same one because this is nothing but the abstract method ,which is responsible for calling the implemented method in the subclass so simply we dob't need seperate objects for this as this is going to pull addresses for different entities so we are going to use the Singleton class or concept.
  

How to create a Singleton class?
There are 3 steps to create a Singleton class
Step 1: Declare a static data member which is a instance of singleton class
Step 2: Create a private constructor which restrict to create instance of a singleton class
Step 3: Create Static factory method which allows to create and access the objects.
and it will restrict to create more than one object.

Advantages of Singleton Class:
It saves memory because it allows us to create only one object.
In Java creating Object is costly because every time we create an object the memory is allocated in JVM.
But in case of Singleton class we can cerate only one object of the class.
