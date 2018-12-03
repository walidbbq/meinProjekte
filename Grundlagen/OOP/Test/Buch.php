<?php

class Buch {
    public $id;
    public $vorname;
    public $nachname;
    public $titel;
    
    public function __construct($id,$vorname, $nachname, $titel) {
        $this->id= $id;
        $this->vorname= $vorname;
        $this->nachname=$nachname;
        $this->titel=$titel;
    }
}

$b1=new Buch(1, "Judith", "Hermann", "Lettipark");
$b2=new Buch(2, "Peter", "Stamm", "Agnes");
$b3=new Buch (3,"Marcel", "Proust","Auf der Suche ..");

$buecherliste=array ($b1, $b2, $b3);

foreach ($buecherliste as $buch){
    echo "ID" . $buch -> id. ", ";
    echo "Titel: " . $buch->titel. "<br>"; 
}

?>