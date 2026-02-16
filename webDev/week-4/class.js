class Shape {
    constructor(color) {
        this.color = color;
    }

    paint() {
        return `the color of this shape is ${this.color}`;
    }

    static whoami() {
        return "Shape class";
    }
}

class Rectangle extends Shape {
    constructor(width, height, color) {
	super(color);
        this.width = width;
        this.height = height;
    } 
    
    area() {
        return this.height * this.width;
    }
}

class Circle extends Shape {
    constructor(radius, color) {
        super(color);
        this.radius = radius;
    }

    area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Square extends Shape {
    constructor(side, color) {
        super(color);
        this.side = side;
    }

    area() {
        return this.side * this.side;
    }
}

let r1 = new Rectangle(100, 20, "red");
let c1 = new Circle(10, "green");

console.log(r1.area());  
console.log(c1.area());  
console.log(c1.paint());
console.log(Shape.whoami());
