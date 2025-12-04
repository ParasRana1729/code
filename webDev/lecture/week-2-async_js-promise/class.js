class athelete{
    constructor(height, weight){
        this.height = height;
        this.weight = weight;
    }
}

class footballer extends athelete{
    constructor(matches, goals, assists, height, weight){
        super(height, weight)
        this.matches = matches;
        this.goals = goals;
        this.assists = assists;
    }

    efficiency(){
        return (this.goals + this.assists)/this.matches;
    }

    getDescription(){
        return `Height :- ${this.height}\nWeight :- ${this.weight}`;
    }
}

const Ronaldo = new footballer(1200, 950, 300, 185, 80);
console.log(Ronaldo.getDescription());

