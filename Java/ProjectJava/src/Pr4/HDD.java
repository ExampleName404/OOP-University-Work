package Pr4;

class HDD {
    int memory;
    int price;
    int weight;

    // так же как в CPU конструктор по умолчанию. Описание крч

    HDD(){
        this.memory = 0;
        this.price = 0;
        this.weight = 0;
    }

    // так же как в CPU ввод данных
    HDD(int memory,int price,int weight){
        this.memory = memory;
        this.price = price;
        this.weight = weight;
    }

    void displayInfo() {
        System.out.println("HDD: Memory = " + memory + "MB, Price = " + price + ", Weight = " + weight + "g");
    }
}
