<?php

// echo "===A=== <br>";
// function array_rueckwaerts_auslesen ($array) {
    
//     for ($i=sizeof($array)-1 ; $i>=0; $i--) {
        
//         echo $array[$i];
        
//     }
// }
// $array1=array(7,15,20);
// array_rueckwaerts_auslesen($array1);
// echo "<br>";


echo "===B===<br>";

function array_rueckwaerts_auslesen_recursiv($array) {
    
    $AnzElm=sizeof($array)-1;
    
    if ($AnzElm==0) {
        
        echo $array[$AnzElm]. ".";
    }
    else {
        echo $array[$AnzElm] . ", ";
        unset ($array[$AnzElm]);
        array_rueckwaerts_auslesen_recursiv($array);
        
    }
    
}

$array2=array(1,2,3,4);
array_rueckwaerts_auslesen_recursiv($array2);


?>

