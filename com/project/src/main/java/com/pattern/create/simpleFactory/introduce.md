简单工厂: 定义一个工厂类，它可以根据所传参数不同创建不同的类的实例，被创建的实例通常都具有共同的父类，因为在简单工厂模式中用于创建实例的方法是静态方法，因此简单工厂模式又被称为静态工厂方法模式，它属于创建模式

模式角色：
1.Factory:工厂类，负责实现创建所有产品实例的内部逻辑；工厂类可以被外界直接调用，创建所需的产品对象；在工厂中类中提供了静态的工厂方法，它的返回的类型为抽象的产品类型
2.Product:抽象产品角色,它是工厂类所创建的所有对象的父类，封装了各种产品的公有方法，它的引入将提高系统的灵活性，使得在工厂中只需要定义一个通用的工厂方法。
3.ConcreteProduct:具体产品角色


