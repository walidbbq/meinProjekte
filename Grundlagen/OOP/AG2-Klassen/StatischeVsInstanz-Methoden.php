<?php

class Datum {

   public $myformat;
//     public $einfach;
//     public $standard;
//     public $detail;
    
    
    function __construct($myformat){
        $this -> myformat =$myformat;
    }
    
    static function  datumAusgeben () {
        $format= 'd/m/y H:i:s';
        $date= date($format, time () );
        echo $date;
    }
    
    function datum4U () {
        
        switch ($this->myformat) {
            
            case "einfach"  : $format='d/m/y' ;  $date=date($format,time());
            break;
            case "standard" : $format='d/m/y H:i' ; $date=date($format,time());
            break;
            case "detail"   : $format='d/m/y H:i:s' ; $date=date($format,time());
            break;
            default         : $date= "Sie haben undefinierten Wert eingegeben! ";
            
            
            
        }
        return $date;
    }
    
}

// $d=new Datum();
// $d->datumAusgeben();

$d1= new Datum("einfach");
echo $d1 -> datum4U();
echo "<br>";

$d2= new Datum("standard");
echo $d2 -> datum4U();
echo "<br>";

$d3= new Datum("detail");
echo $d3 -> datum4U();
echo "<br>";

echo Datum::datumAusgeben();
?>