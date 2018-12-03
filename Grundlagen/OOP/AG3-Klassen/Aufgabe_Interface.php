<?php
interface GeometrischForm {
    public function flaecheBerechnen();
}



//Class Rechteck

class Rechteck implements GeometrischForm{
    public $hoehe;
    public $breite;
    
    function __construct($hoehe,$breite){
        $this->hoehe = $hoehe;
        $this->breite= $breite;
    }
    public function flaecheBerechnen(){
        return $this-> hoehe * $this->breite;
    }
}


//Class Quadrat
class Quadrat implements GeometrischForm {
    public $seitenlaenge;
    
    function __construct($seitenlaenge){
        $this-> seitenlaenge = $seitenlaenge;
    }
    
    public function flaecheBerechnen(){
        return $this -> seitenlaenge * $this-> seitenlaenge;
    }
}


//Class Kreis

class Kreis implements GeometrischForm {
    public $radius;
    
    function __construct($radius){
        $this-> radius = $radius;
    }
    
    public function flaecheBerechnen(){
       return pi()* $this->radius* $this->radius;
    }
}

function meinQ ($array) {
    $myarrayQ=array();
    $myarrayR=array();
    $myarrayK=array();
    for ($i=0 ; $i<=$array; $i++) {
       
        $rand=rand(5,20);
        
        if ($i<=10) {
        $t=new Quadrat($rand);
        $tmp= $t->flaecheBerechnen();
        $myarrayQ[]=$tmp;
        }
        
        else if ($i>10 And $i<=20) {
            $t=new Rechteck($rand,$rand+3);
            $tmp= $t->flaecheBerechnen();
            $myarrayR[]=$tmp;
        }
        
        else if ($i>20 AND $i<=30) {
            $t=new Kreis($rand);
            $tmp= $t->flaecheBerechnen();
            $myarrayK[]=$tmp;
            
        }
        
}

echo "<br> MeineQuadrate";
print_r($myarrayQ) ;
echo "<br> MeineRechtecke";
print_r($myarrayR);
echo "<br> MeineKreise";
print_r($myarrayK);

// return $myarray;
}
$r =meinQ(30);
echo "<br>";
$r= new Rechteck(10,4);
echo $r -> flaecheBerechnen();
echo "<br>";
$q= new Quadrat(10);
echo $q->flaecheBerechnen();
echo "<br>";
$k=new Kreis(10);
echo $k->flaecheBerechnen();

?>