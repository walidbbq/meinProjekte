<?php

require 'Adresse.php';
class person {
    
    private $vorname;
    private $nachname;
    private $adresse;
    
    function __construct($vorname,$nachname,$adresse) {
      
        $this->vorname=$vorname;
        $this->nachname=$nachname;
        $this->adresse=$adresse;
    }
    
 
    
    function getVorname() {
        return $this->vorname;
    }
    
    function getNachname() {
        return $this->nachname;
    }
    
    function getAdresse() {
        return $this->adresse;
    }
    
}



$adresse= new Adresse("Luxemburger Str.", "34", "50937", "Köln");

$person= new person("Paul", "Schmitz", $adresse);

echo $person -> getNachname(). "<br>" ;
echo $person -> getAdresse()-> getStrasse().
     $person -> getAdresse()-> getHausnr()."<br>";
echo $person->getAdresse() -> getPlz();


?>