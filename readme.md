**string constant pool:-** inside heap there lies a constant pool 
If an object is presnt with one name then of same name a another string cant be created
heap area -> literal area

*String (2 types):-*
1. literals - String str = "Hi" (immutable)
2. String str = new String("Hi) (mutable) stored inside heap area

**SOLID PRINCIPLE :-**
S - Single Responsibility Principle: A class should have only one reason to change, focusing on a single, well-defined job.
O - Open-Closed Principle: Software components should be extendable without modifying existing code.
L - Liskov Substitution Principle: Subclasses must be substitutable for their base classes without altering program correctness.
I - Interface Segregation Principle: It is better to have many client-specific interfaces rather than one general-purpose interface.
D - Dependency Inversion Principle: Depend upon abstractions, not concretions.

**DESIGN PRINCIPLE :-**
Balance: The distribution of visual weight, symmetry, or asymmetry to create stability.
Emphasis: Creating a focal point or drawing the viewer's eye to the most important element.
Movement: Guiding the viewer’s eye through the composition, often using lines or curves.
Proportion: The scaling of objects in relation to each other to show importance.
Repetition / Pattern: Using recurring colors, shapes, or elements to build consistency and unity.Contrast: Using extreme differences in color, size, or shape to make elements stand out.
Unity: Ensuring all elements work together cohesively so the final design feels complete

jdk version:-
1. *string* (1.5) , immutable , appending two strings .conctat , no thread safety
2. *string buffer* (1.6) , mutable , + , by default thread saved
3. *string* builder* (1.5) , mutable , + , no thread safety


**Methods**
public--> public , private , Default , protective
1. Static - Method area , 
2. Non Static - Heap Area ,


**Static Non-Static**
1. static - > static
    *For same classes*
    class demo{
        psv add(){

        }
        psv sub(){
           * add();*
        }
    }                         //just add();




    *For diffrent classes*
    class demo{
        psv add(){

        }
        
    }   
    
    class demo2{
        psv sub(){
          *  demo.add();*
        }
    }                      






2. static - > Non static         //Not Possible
    class Demo{
            p void add(){

            }
            psv sub(){
            
            }
        }    




3. Non static - > Non static       //Object creation
    class Demo{
            p void add(){

            }
            psv sub(){
                Demo demo = new demo();
                demo.add();
            }
        }      





4. Non static - > static          //Using oblject creation
    class Demo{
            p void add(){

            }
            psv sub(){
                Demo demo = new demo();
                demo.add();
            }
        }  



**Exceptions**
*Types*
1. Checked -> Throwable ->Throwable class and complier forces to check imediately
2. Unchecked -> Runtime -> Compiler Unkown errors

Objects
   |
Throwable
   |
 |---------------------------|                          
Runtime                 File Not Found
   |
AOB
Stack Overflow
Null Pointer
Arithmethic
S/O Exception
File not found


What is Object ?

            