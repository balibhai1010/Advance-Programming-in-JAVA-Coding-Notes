package org.example;

public class _38_Java_access_modifiers_public_protected_private {
    //access modifiers add level of security in our program
    //video is good for explain
    //package is collection of classes
    //package package2
    //import package1.*
    //class is collection of code
//    public: visible in all classes in all packages
//    protected: visible to all classes in the same package or classes in other packages that are a subclass
//    default: visible to all classes in the same package , not accessible in other packages
//    private: visible only in the same class
    /**
     * Access modifiers and their corresponding access levels in Java:
     *
     * +------------------+----------------------------------------+--------------------------------------------------------------------------+
     * | Access Modifier  | Description                            | Example                                                                  |
     * +------------------+----------------------------------------+--------------------------------------------------------------------------+
     * | Public           | Accessible from any class or package.  | public class MyClass { }                                                  |
     * |                  |                                        | Access Level: Class, Package, Subclass, World                             |
     * +------------------+----------------------------------------+--------------------------------------------------------------------------+
     * | Private          | Accessible only within the same class. | private int myVariable;                                                  |
     * |                  |                                        | Access Level: Class                                                     |
     * +------------------+----------------------------------------+--------------------------------------------------------------------------+
     * | Protected        | Accessible within the same class and   | protected void myMethod() { }                                            |
     * |                  | its subclasses.                        | Access Level: Class, Package ,Subclass                                   |
     * +------------------+----------------------------------------+--------------------------------------------------------------------------+
     * | Default          | (No keyword)                           | // Package-private/default access; accessible within the                   |
     * | (no modifier)    |                                        | // same package or module.                                               |
     * |                  |                                        | class MyDefaultClass { }                                                 |
     * |                  |                                        | Access Level: Class, Package (Module), Subclass                         |
     * +------------------+----------------------------------------+--------------------------------------------------------------------------+
     */

}
