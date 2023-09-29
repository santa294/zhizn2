package com.company;

public enum Status {
    NONE,    //1
    BORN,    //2
    LIVE,   //1
    DIED; //2

    public Status step1 (int around){

        switch (this){
            case NONE : return (around==3)? BORN :NONE;
            //Если никакой объект, то проверяем: если around будет больше 3, то возвращаем BORN. Иначе NONE
            case LIVE:return (around<=1||around>=4)? DIED:LIVE;
            //для if можно сделать следующую запись:
            //(<условие>)  ? <значение, если истина> : <значение, если ложь>
            //это на заметку
            default: return this;
            // если ни то, ни другое, то оставляем всё как есть
        }
    }
    public Status step2 (){
        // нужно перебрать все элементы и из борн сделать лайв
        switch (this){
            case BORN : return LIVE;
            case DIED:return NONE;
            default:return this;
        }
    }
    public boolean isCell(){
        return this == LIVE||this ==DIED;
    }
}
