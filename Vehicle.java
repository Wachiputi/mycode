class vehicle{
    //declairing variables
    private String name;
    private int engineType;
//a constructor
    vehicle(){

    }
    //gettee and setter methods
    public void setName(String name){
        this.name = name;
    }public void setEngineType(int engineType){
        this.engineType = engineType;
    }public String getName(){
        return name;
    }public int getEngineType(){
        return engineType;
    }

}