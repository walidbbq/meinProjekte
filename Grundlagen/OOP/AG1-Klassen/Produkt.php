<?php

class produkt {
    
    public $id;
    public $ProduktName;
    public $preis;
    public $vorrätig;
    
  
    function __construct($id, $ProductName, $preis, $vorrätig) {
        $this-> id=$id;
        $this-> ProduktName=$ProductName;
        $this-> preis=$preis;
        $this-> vorrätig =$vorrätig; 
    }
    
    function rabattieren () {
        
        $neupreis= $this->preis  - ($this -> preis * 0.1);
        return $neupreis;
    }
    
}


// $p1=new produkt(111, "Kaffeemaschine", 35.95, true);
// $p2= new produkt(222, "Stabmixer", 29.99, false);
// $p3=new produkt(333, "Wasserkocher", 12.50, true);
// $p4=new produkt(444, "Saftpreis", 21.99, true);

// $my_produkte=array($p1,$p2,$p3,$p4);

// $p1=new produkt($id, $ProductName, $preis, $vorrätig);

$my_produkte= array ( new produkt(111, "Kaffeemaschine", 35.95, true),
                      new produkt(222, "Stabmixer", 29.99, false),
                      new produkt(333, "Wasserkocher", 12.50, true),
                      new produkt(444, "Saftpreis", 21.99, true)
);

for ($i=0; $i<sizeof($my_produkte); $i++){

    echo $my_produkte[$i]->ProduktName . " / Ursprüngliche Preis: " . $my_produkte[$i]->preis. " / New Preis: ".$my_produkte[$i]->rabattieren() . "<br>";
}


?>