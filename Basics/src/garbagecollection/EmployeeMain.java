package garbagecollection;

public class EmployeeMain 
{
	public static void main(String[] args) {
        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);
        E.show();
        F.show();
        G.show();
        E.showNextId();//1
        F.showNextId();//2
        G.showNextId();//3
 
        { // It is sub block to keep
            // all those interns.
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();//
            Y.show();//
            X.showNextId();//4
            Y.showNextId();//5
            X=Y=null;
            System.gc();
            System.runFinalization();

        }
        // After countering this brace, X and Y
        // will be removed.Therefore,
        // now it should show nextId as 4.
           
          // Output of this line
        E.showNextId();
        // should be 4 but it will give 6 as output.
    }
}

