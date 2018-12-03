<?php

class katze {
    
    public $name;
    public $fellfarbe;
    
    
    //Methoden
    
    function tagesablauf (){
        
        return $this -> name . ": " . $this -> schlafen() . 
          $this -> schnurren() . $this -> fressen() .
          $this -> MaeuseJagen();
          
        
    }
    
    function schlafen () {
        return  $this-> name . "schläft /" ;
    }
    
    
    function schnurren () {
        return $this-> name . " schnurrt/" ; 
    }
    
    function fressen () {
        return $this-> name . " frisst /" ;
    }
    
    function MaeuseJagen (){
        return $this-> name . " jagt Mäuse /" ;
    }
    
}

$k1 = new katze();
$k1 -> name = "krkr";
// echo $k1 -> tagesablauf();

$k2= new katze();
$k2 -> name = "roro";

$k3= new katze();
$k3 -> name = "uou";

$k4= new katze();
$k4 -> name = "iror";

$k5= new katze();
$k5 -> name = "oepe";

$my_katze =array ($k1,$k2,$k3,$k4,$k5);
// echo $my_katze;
// print_r ($my_katze);

for ($i=0; $i<sizeof($my_katze); $i++) {

    $zufall=rand(0,3);
   if ($zufall==0){
       echo $my_katze[$i]-> schlafen();
   }
   else if ($zufall==1){
       echo $my_katze [$i]-> schnurren();
   }
   else if ($zufall==2){
       echo $my_katze [$i]-> fressen();
   }
   
   else if ($zufall==3){
       echo $my_katze [$i]-> MaeuseJagen();
   }
}

?>