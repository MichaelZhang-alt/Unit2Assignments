
public class Student {

    //step 1 - define instance variables
    //these make up the properties of an object
    //they are usually private
    private String name;
    private int test1, test2, test3;

    //step 2 - Constructor
    //public < Name of class goes here >
    //this runs when the word NEW is used to make an object
    //its purpose is to initialize some or all properties
    public Student() {
//        name = "";
//        test1 = 0;
//        test2 = 0;
//        test3 = 0;
//        System.out.println("Student was created");
        //call another constuctor from here
        this("", 0, 0, 0); //chaining constructors
    }

    //another constructor
    //this one lets you assign properties as you make the student
    public Student(String str, int m1, int m2, int m3) {
        name = str;
        test1 = m1;
        test2 = m2;
        test3 = m3;
    }

    //3rd constructor
    //this one lets you clone properties from another student
    public Student(Student other) {
//        name = other.name;
//        test1 = other.test1;
//        test2 = other.test2;
//        test3 = other.test3;
        this(other.name, other.test1, other.test2, other.test3);
    }

    //step 3 - rest of the instance methods
    //this will make up the abilities of the object
    //sets name of student
    public void setName(String n) {
        name = n;
    }

    //retrieves name of student
    public String getName() {
        return name;
    }

    //set and get back a given mark
    public void setMark(int which, int score) {
        if (which == 1) {
            test1 = score;
        } else if (which == 2) {
            test2 = score;
        } else {
            test3 = score;
        }
    }

    public int getMark(int which) {
        if (which == 1) {
            return test1;
        } else if (which == 2) {
            return test2;
        } else {
            return test3;
        }
    }

    public int getAverage() {
        return (test1 + test2 + test3) / 3;
    }

    public int getHighest() {
        int highest = test1;
        if (test2 > highest) {
            highest = test2;
        }
        if (test3 > highest) {
            highest = test3;
        }
        return highest;
    }

    //this method runs automatically when you print an object
    //we are over-riding the toString found in Parent class
    public String toString() {
        String s = "Name:\t" + name;
        s += "\nTest1:\t" + test1;
        s += "\nTest2:\t" + test2;
        s += "\nTest3:\t" + test3;
        s += "\n-----------------";
        s += "\nAverage:  " + getAverage();
        return s;
    }

    public String validateData() {
        String em = null;
        if (name.equals(""))//then a name was not entered
        {
            em = "Name is required.";
        }
        if (test1 < 0 || test1 > 100 || test2 < 0 || test2 > 100 || test3 < 0 || test3 > 100) {
            if (em == null) //then no error
            {
                em = "At least 1 mark is out of the acceptable range";
            } else//add on to the message with +=
            {
                em += "\nAt least 1 mark is out of the acceptable range";
            }
        }
        if (em != null) //then we have an error so add the following line after it
        {
            em += "\nPlease re-enter all the data\n";
        }
        return em; //return error message, either null or real message

    }
}
