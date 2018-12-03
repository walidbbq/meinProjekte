<?php

class Haustier {
    
    public $name;
    public $tierart;
    
    function fressen () {
        return $this -> tierart . " ". $this -> name. " ". " frisst";
    }    
    
    function schlafen () {
        return $this -> tierart . " ". $this -> name. " ". " schläft";
 
    }
    
}


class Katze extends Haustier {
    
    function fressen(){
        return $this -> tierart . " ". $this -> name. " ". " frisst Maus";
    }
    function schnurren () {
        return $this -> tierart . $this -> name . " ". " schnurrt";
    }
}

class Kaninchen extends Haustier {
    
    function fressen(){
        return $this -> tierart . " ". $this -> name. " ". " frisst Heu";
    }
    function MitDenZähnenKlappern () {
        return $this -> tierart . $this -> name . "  " . "  klappert mit den Zähnen";
    }
}

class Hund extends Haustier {
    
    function fressen(){
        return $this -> tierart . " ". $this -> name. " ". " frisst Knochen";
    }
    
    function apportieren () {
        return $this -> tierart . $this -> name . " ". "apportiert";
    }
}

$Ht= new Haustier();
$Ht -> tierart="Katze"; $Ht -> name="Koko";
echo $Ht -> fressen();

echo "<br>";

$Htk= new Katze();
$Htk -> tierart="Katze"; $Htk -> name="Kiki";
echo $Htk -> fressen(); 
echo "<br>";

$kan= new Kaninchen();
$kan -> tierart="Kaninchen "; $kan -> name="Kan";
echo $kan -> fressen();
echo "<br>";

$kan1= new Kaninchen();
$kan1 -> tierart="Kaninchen "; $kan1 -> name="Kano";
echo $kan1 ->MitDenZähnenKlappern();
echo "<br>";

$Hun= new Hund();
$Hun -> tierart="Hund "; $Hun -> name="Huhu";
echo $Hun ->apportieren();
echo "<br>";

$Hun1= new Hund();
$Hun1 -> tierart="Hund "; $Hun1 -> name="Hoy";
echo $Hun1 ->fressen();
echo "<br>";


$ueberMethoden=array($Ht,$kan,$Hun1);

foreach ($ueberMethoden as $tier) {
    echo "<pre>" . $tier -> fressen() . "</pre>";
    
}

?>