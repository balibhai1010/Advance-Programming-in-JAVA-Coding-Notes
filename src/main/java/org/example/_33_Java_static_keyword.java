package org.example;

public class _33_Java_static_keyword {

        public static void main(String[] args) {

            // static = modifier. A single copy of a variable/method is created and shared TO ALL CLASSES .
            //			The class "owns" the static member

            Friend friend1 = new Friend("Sponegbob");
            Friend friend2 = new Friend("Patrick");
            Friend friend3 = new Friend("Patrick");
            //friend1 ,2,3 share same variable numberOfFriends
            //but not share numberOfFriendss,each have individual seperate variable named numberOfFriendss

            System.out.println(Friend.numberOfFriends);
            System.out.println(friend1.numberOfFriends); //it works but it's bad manner,static stuff should be called in static way
            System.out.println(friend2.numberOfFriends);
            System.out.println(friend3.numberOfFriends);

            //this is not possible : System.out.println(org.example.Friend.numberOfFriendss);
            System.out.println(friend1.numberOfFriendss);
            System.out.println(friend2.numberOfFriendss);
            System.out.println(friend3.numberOfFriendss);

            Friend.friendscount();

            //Math.round() is static func.
            //,so we can easily implement it without writing the declaration of any class
            //,like we dont write Math math = new Math();
            Math.round(22);

        }
    }
    //**********************************************
    class Friend {



        String name;

        static int numberOfFriends; //static variable ,layman talk : global enough to used by all classes
        int numberOfFriendss;
        Friend(String name){
            this.name=name;
            numberOfFriends++;
            numberOfFriendss++;
        }

        static void friendscount(){//static method
            System.out.println("You Have "+numberOfFriends+" friends !!!");
        }
    }//**********************************************
