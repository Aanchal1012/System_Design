package user;

import interfaces.IUser;

public abstract class User implements IUser {
    protected String id;
    protected String name;
    //constructor
    public User(String id, String name){
        this.id=id;
        this.name=name;

    }
    @Override
    public String getId(){
        return id;
    }
    public String getName(){
        return name;

    }
}
