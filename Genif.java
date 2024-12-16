interface abstrIf <T> {
    void nameMeth(T o);
}

class MyClass <T> implements <T>{
    ...
}

//возможен вариант
class MyClass implements <double>{
    ...
}
