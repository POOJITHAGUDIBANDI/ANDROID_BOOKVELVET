package com.example.bookvelvetfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Books extends AppCompatActivity {

    ListView listView;
    String[] name= {"Hack Proofing Your Network","Computer Architecture A Quantitative Approach",
            "Java Web Services Architecture",
            "Embedded System Architecture",
            "Data Mining Concepts and Techniques",
            "Engineering A Compiler",
            "Object-Oriented Design With UML and JAVA",
            "Digital Design An Embedded Systems Approach Using",
            "An Introduction to Parallel Programming",
            "Remote Sensing Models and Methods for Image",
            "Soa and Services Interface Design",
            "Reconfigurable Computing",
            "Principles of Computer System Design",
            "Programming and Problem Solving Through C",
            "Digital Design and Computer Architecture",
            "Fault-Tolerant Systems",
            "The Art of Multiprocessor Programming",
            "Probability and Random Processes",
            "Programming Language Pragmatics",
            "Artificial Intelligence: A New Synthesis",
            "Advanced Compiler Design and Implementation",
            "Parallel Computer Architecture",
            "Data Mining",
            "Mastering Data Mining",
            "Computer Components: Principles of Embedded",
            "Network Programming in .NET with C# and Visual",
            "Computational Intelligence Concepts",
            "Unleashing Web 2.0: From Concepts to Creativity",
            "Fundamentals of the Theory of Computation",
            "Organizing Information",
            "Probability Models for Computer Science",
            "The Grid: Blue print for a Computing Infrastructure",
            "Understanding Virtual Reality",
            "The Art of Designing Embedded Systems",
            "Simulation",
            "Probability Statistics, and Queueing Theory ",
            "Computer Networks A Systems Approach",
            "Computers as Components",
            "Computer Organization and Design",
            "Visual Basic 6.0",
            "Foundations of IT",
            "Fundamentals of Information Technology",
            "Operations Research",
            "Computer Graphics",
            "Algorithms Design and Analysis",
            "The A to Z of PC Hardware & Maintance Vol - I",
            "VB.NET with Projects",
            "C Programming & Data Structures",
            "Practical World C++",
            "Discrete Mathematical Structures",
            "Theory of Computation",
            "Data Structures through C",
            "Object-Oriented Programming Using C++",
            "Object Oriented Programming Through JAVA",
            "Computer Concepts and C Programming",
            "Object Oriented Programming in Java",
            "Comdex Information Technology Course Kit",
            "Compilers Principles,Techniques,and Tools",
            "Fundamentals of Database Management Systems",
            "C & Data Structures",
            "The Complete Computer Upgrade & Repir Book",
            "Object-Oriented Programming: from Problem Solving",
            "Web Technology",
            "Grid Computing A Practical guide to Technology",
            "Computer Forensics: Computer Crime Scene",
            "Software Engineering",
            "Operating System Fundamentals",
            "Operating System Fundamentals",
            "Data and Computer Network Communication",
            "Data and Computer Network Communication",
            "Compiler Construction Principles and Practice",
            "Data Structures using C++",
            "Fundmentals of Programming Languages",
            "Fundmentals of Programming Languages",
            "The Essential Clinet/Server Survival Guide",
            "Multimedia Communications Directions & Innovations",
            "Discrete Mathematics With Applications",
            "Discrete Mathematics With Applications",
            "C and Data Structures",
            "Engineering Mathematics-1",
            "Information Security",
            "C & Data Structure",
            "C & Data Structure",
            "A Text Book on Mathematical Methods",
            "Statical Methods and Computer Applications",
            "Statical Methods and Computer Applications",
            "A Text book of Remidial Mathematics",
            "Information Technology Numerical Methods",
            "Probability & Random Variables",
            "Operating Systems & Systems Programming",
            "Discrete Mathematics",
            "Operating Systems",
            "Computers and Information Technology",
            "Management Science",
            "Web Development & Design Foundations With XHTML",
            "C++ Solutions: Companian to the C++ Programming",
            "Inter Connections, Bridges, Routers, Switches",
            "Problem Solving With C++",
            "The Object of Programming An Introduction to Object-Oriented Programming Programming Principles and Practice using C++ LISP",
            "Advanced Programming in Java 2 updated to J2SEE",
            "Advanced Programming in Java 2 updated to J2SEE",
            "An Encyclopedia of Computer Terminology",
            "Computer Networks: A Pragmatic Approach",
            "Concepts in Datastructures and Software Development",
            "Programming in JAVA2",
            "A Encyclopaedia of Computer Terminology",
            "Mein Kampf (My Struggle)",
            "Management Principles and Practice",
            "Visual Computing with Visual Basic",
            "Wisdom for the New Millennium",
            "Web Engineering",
            "Algorithm Design",
            "Algorithm Design",
            "Data Structures and Algorithms in C++",
            "Programming Languages Design Concepts",
            "Programming Languages Design Concepts",
            "Programming Languages Design Concepts",
            "The Data Warehouse Lifecycle Toolkit",
            "The Architecture of Computer Hardware and Systems",
            "The Data Warehouse Toolkit",
            "Thinking in C++",
            "Unix Shell Programming",
            "Fundamentals of Data Structures in Pascal",
            "Applied Discrete Structures for Compurter Science",
            "Object-Oriented Programming in Microsoft C++",
            "Java2: The Complete Reference Book",
            "Fundamentals of Computer Algorithms",
            "Web Technology and Application Development",
            "Web Technology and Application Development",
            "Data Warehouse Development Tools",
            "Data Warehouse Development Tools",
            "An Introduction to Programming and Object ",
            "An Introduction to Programming and Object ",
            "Algorithms for VLSI Design Automation",
            "Data Warehousing Fundamentals",
            "Foundation of Algorithms",
            "Software Architecture and Design Illaminated",
            "Game Design Foundations",
            "Discrete Structures logic and Computability",
            "C++ Plus Data Structures",
            "C++ Plus Data Structures",
            "Essentials of Software Engineering",
            "Introducing the Theory of Computation",
            "Essentials of Discrete Mathematics",
            "Logic, Sets, and Recursion",
            "Logic, Sets, and Recursion",
            "An Introduction to Analysis",
            "An Introduction to Analysis",
            "C Programming for Scientists and Engineers",
            "C++ An Active Learning Approach",
            "A Laboratory Course for Programming with Java",
            "A Laboratory Course for Programming with Java",
            "The Hindu Speaks on Information Technology",
            "Applied Cryptography",
            "Software Engineering An Engineering Approach",
            "Software Testing Techniques",
            "Digital Multimedia",
            "Digital Multimedia",
            "Mobile Computing",
            "A Guide to Expert Systems",
            "CGI Programming with TCL",
            "Discrete Mathematics",
            "Discrete Mathematics",
            "Operations Research Problems and Solutions",
            "Recent Trends in Technical Educations",
            "Object Orientation through C++",
            "Network Security: A Hocker's Perspective",
            "Database Management System: Concept, Design",
            "Operating Systems",
            "Statistics for Business and Economics",
            "E-Commerce",
            "Cryptography and Network Security",
            "Computer Architecture",
            "Contemporary Issues in Engineering Education",
            "Compiler Construction Principles and Practice",
            "Business on the Net",
            "Practical Software Estimation",
            "Introduction to Programming Java",
            "Analysis and Design of Parallel Algorithms",
            "Procedural Elements for Computer Graphics",
            "Masteing Cloud Computing",
            "Machine Learning",
            "A First Course in Artificial Intelligence",
            "Mobile Cellular Telecommunications",
            "Object Oriented Systems Development",
            "Computer Architecture And Logic Design",
            "Analysis & Design of Information Systems",
            "Data Structures with C++",
            "Object-Oriented Systems Analysis and Design",
            "Effective Technical Communication",
            "Effective Technical Communication",
            "Computer Architecture and Organization",
            "Computer Architecture and Organization",
            "Computer organization",
            "Computer organization",
            "Database System Concepts",
            "Artificial Intelligence",
            "Communication Systems",
            "Programming With Java A Primer",
            "Operating Systems: A Spiral Approach",
            "Operating Systems: A Spiral Approach",
            "Computer Architecture and Parallel Processing",
            "Computer Architecture and Parallel Processing",
            "Artificial Neural Networks",
            "Theory and Problems of Prograqmming With Java",
            "Theory and Problems of Prograqmming With Java",
            "Introduction Visual C++: Microsoft Visual C++",
            "Programming Language Pragmatics",
            "Introduction to Data Compression",
            "Introduction to Data Compression",
            "Database Principles Programming and Performance",
            "Database Principles Programming and Performance",
            "Wireless Sensor Networks",
            "Smart Phone & Next Generation Mobile Computing",
            "High-Performance Communication Networks",
            "Computers as Components",
            "Database Management Systems",
            "Software Engineering",
            "Software Engineering",
            "Data Warehousing Olap and Data Mining",
            "Principles of Data Structures Using C and C++",
            "Programming in C",
            "Programming in C",
            "Object Oriented Programming and C++",
            "C Language and Numerical Methods",
            "Software Engineering",
            "Mathematical Foundations of Computer Science",
            "Computer Architecture",
            "Computer Architecture",
            "Internet & Java Programming",
            "Solid State Physics",
            "Numerical Methods for Scientific and Engineering Computation",
            "Proceedings of the Asia Pacific Conference",
            "Parallel Computing",
            "Theory of Automata, Formal Languages",
            "Computer Fundamentals Architecture and Organization",
            "Computer Fundamentals Architecture and Organization",
            "Computer Fundamentals Architecture and Organization",
            "Programming with C++",
            "Programming with C++",
            "Computer Fundamentals",
            "Theory of Computation",
            "Theory of Computation",
            "A Practical Approach to Datastructures",
            "A Practical Approach to Datastructures",
            "A Practical Approach to Datastructures",
            "C & Data Structures by Practice",
            "C & Data Structures by Practice",
            "C & Data Structures by Practice",
            "C & Data Structures by Practice",
            "C & Data Structures by Practice",
            "C & Data Structures by Practice",
            "Computer Network",
            "C++ For Beginner's Masters",
            "C++ For Beginner's Masters",
            "English for Engineer's and Technologies - I",
            "English for Engineer's and Technologies - II",
            "English Skills for Technical Students",
            "English for Engineers and Technologists a skills",
            "A Textbook of English for Engineers and Technologists",
            "A Textbook of English for Engineers and Technologists",
            "Digital Principles and System Design",
            "Digital Principles and System Design",
            "Graph Theory",
            "Foundations of Parallel Processing",
            "An Integrated Approach to Software Engineering",
            "Strengthen Your Writing",
            "Software Engineering Fundamentals",
            "Software Engineering Fundamentals",
            "Distributed Computing",
            "Distributed Computing",
            "Software Testing Principles and Practices",
            "Software Testing Principles and Practices",
            "Software Testing Principles and Practices",
            "Software Testing Principles and Practices",
            "8051 Microcontrollers",
            "8051 Microcontrollers",
            "8051 Microcontrollers",
            "Formal Languages and Automata Theory",
            "Web Technologies",
            "Web Technologies",
            "Web Technologies",
            "Natural Language Processing and Information",
            "Natural Language Processing and Information",
            "Software Engineering Concepts and Applications",
            "Principles of Microcomputers and Microcontroller",
            "Introduction to Parallel Computing",
            "Introduction to Parallel Computing",
            "Principles of Computer Hardware",
            "Neural Networks for Pattern Recognition",
            "Neural Networks for Pattern Recognition",
            "Neural Networks for Pattern Recognition",
            "Computational Intelligence",
            "Computational Intelligence",
            "Computer Architecture",
            "Computer Architecture",
            "Computer Architecture",
            "Computer Architecture",
            "Computer Fundamentals and Programming in C",
            "Computer Fundamentals and Programming in C",
            "Discrete Mathematics",
            "Discrete Mathematics",
            "Discrete Mathematics",
            "An Introduction to Quantum Computing",
            "Networks for Computer Scientists and Engineers",
            "Networks for Computer Scientists and Engineers",
            "Artificial Intelligence and Intelligent Systems",
            "Artificial Intelligence and Intelligent Systems",
            "Artificial Intelligence and Intelligent Systems",
            "Bioinformatics Computing",
            "Programming Visual Basic",
            "Visual Programming",
            "Design and Analysis of Algorithm",
            "Design and Analysis of Algorithm",
            "An Overview of Internet Programming",
            "Practical Communication Communicative English",
            "Overview of Wireless Sensor Networks and Energy",
            "Object Oriented Analysis and Design",
            "Theory of Computation",
            "Operating Systems",
            "Introduction to Database Management Systems",
            "Introduction to Database Management Systems",
            "Theory of Computation",
            "Discrete Mathematics",
            "Object Oriented Programming",
            "Object Oriented Programming",
            "Programming in C++",
            "Programming in C++",
            "Zigbee Concepts and Applications",
            "Introductory Methods of Numerial Analysis",
            "Multimedia: Computing,Communications & Applications",
            "Multimedia: Computing,Communications & Applications",
            "Understanding Object Oriented Programming with JAVA",
            "Data Structures and Algorithm Analysis in C",
            "Effective Technical Communication",
            "Object- Oriented Programming C++",
            "Object- Oriented Programming C++",
            "Object- Oriented Programming C++",
            "Mobile Computing",
            "Mobile Computing",
            "Mobile Computing",
            "Mobile Computing",
            "Mobile Computing",
            "Programming with Ansi C++: A step by step Approach",
            "Discrete Mathematics",
            "Discrete Mathematics",
            "Discrete Mathematics",
            "Data Structures using C++",
            "An Introduction to Numerical Methods in C++",
            "Systems Programming",
            "Programming With ANSI C++",
            "Programming With ANSI C++",
            "Programming With ANSI C++",
            "Programming With ANSI C++",
            "Human Resource Development",
            "Software Engineering Principles and Practices",
            "Software Engineering Principles and Practices",
            "Software Engineering Principles and Practices",
            "Programming in JAVA",
            "Programming in JAVA",
            "Knowledge Management in Organizations",
            "Computer Programming and Data Structures",
            "Computer Programming and Data Structures",
            "Computer Programming and Data Structures",
            "Computer Programming and Data Structures",
            "An Introduction to the Theory of Computer Science",
            "Simply C++",
            "Fundamentals of Software Integration",
            "Artificial Intelligence and Newral Networks",
            "E-Business and E-Commerce Management",
            "The X 86 PC Assembly Language, Design",
            "The X 86 Microprocessors",
            "Human Rights Gender and the Environment",
            "Ethics Theory and Practice",
            "Ethics Theory and Practice",
            "Object-Oriented Software Engineering using UML",
            "Writing Effective use Cases",
            "Introduction to SQL",
            "Build IT. Fix IT. Own IT",
            "Understanding Data Communications",
            "Problem Solving and Programming Concepts",
            "Parallel Programming",
            "Principles of Parallel Programming",
            "Principles of Parallel Programming",
            "Introduction to Formal Languages, Automata Theory",
            "Introduction to Formal Languages, Automata Theory",
            "Introduction to Formal Languages, Automata Theory",
            "Finite Automata and Formal Languages",
            "Quality Software Project Management",
            "Software Engineering for Students: A Programming",
            "Software Engineering for Students: A Programming",
            "Visual Quck start guide SQL",
            "Core Servlets And Java Server Pages Vol. 2",
            "Design Patterns: Element of Reusable Object",
            "Data and Text Mining",
            "Artificial Intelligence: A guide to Intelligent",
            "Information Technology in Action",
            "Approaching Quantum Computing",
            "Computer Ethics",
            "Computer Ethics",
            "Computer Ethics",
            "Intoduction to Information Technology",
            "Intoduction to Information Technology",
            "Discrete and Combinatorial Mathematics",
            "Discrete and Combinatorial Mathematics",
            "Electronic Devices And Circuits",
            "MULTIMEDIA IN PRACTICE",
            "Artificial Intelligence A Modern Approach",
            "Computer Fundamentals",
            "Computer Fundamentals",
            "Computer Fundamentals",
            "Multimedia Systems Design",
            "Sams Teach Yourself SQL in 24 Hours",
            "Digital Fundamentals",
            "Computer Graphics Principles & Practice",
            "Computer Programming and Data Structures",
            "Computer Programming and Data Structures",
            "Object Oriented Programming Through JAVA",
            "Computer Networks",
            "Computer Networks",
            "Data Mining",
            "Data Mining",
            "Data Mining",
            "Data Warehousing",
            "Data Warehousing",
            "Data Warehousing",
            "Data Warehousing",
            "Programming in C",
            "Programming in C",
            "Programming in C",
            "Programming in C",
            "Data Structures Using C",
            "Data Structures Using C",
            "Data Structures Using C",
            "Data Structures via C + + objects by Evolution",
            "Data Structures via C + + objects by Evolution",
            "Data Structures via C + + objects by Evolution",
            "Technical Communication Principles and Practice",
            "Software and Hardware Engineering",
            "Network Security Essentials",
            "Fundamentals of Database Systems",
            "Fundamentals of Database Systems",
            "Advanced Computer Architectures",
            "Probability and Random Processes",
            "Human-Computer Interaction in the New Millennium",
            "Designing the User Interface",
            "Designing the User Interface",
            "Object-Oriented Analysis & Design",
            "Artificial Intelligence",
            "Artificial Intelligence",
            "Data Structures and Program Design in C",
            "Upgrading and Repairing Pcs",
            "The Pearson Guide to Quantitive Aptitude for Cat",
            "Microprocessors and Microcontrollers",
            "The 8085 Mocroprocessor Architecture Programming",
            "Unix for Programmers and Users",
            "Elements of the Theory of Computation",
            "Algorithms",
            "Real-Time Systems Theory and Practice",
            "Simply Java Programming",
            "VHDL Design Representation and Synthesis",
            "Grid Computing",
            "Pointers on C",
            "Managing Software Requirement",
            "Modern Compiler Design",
    };
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        listView=findViewById(R.id.listview);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(arrayAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem=menu.findItem(R.id.action_search);
        SearchView searchView=(SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type here to search");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}