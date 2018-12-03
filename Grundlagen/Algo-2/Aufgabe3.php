<?php

function IntegerRueckwaerts($arr) {
    
    for ($i=0; $i<sizeof($arr); $i++) {
        for ($j=0; $j<sizeof($arr); $j++)
            
            if ($arr[$i] > $arr[$j]  ) {
                echo "i ist: $arr[$i] <br> j ist $arr[$j] <br> ".
                $temp=$arr[$i];
//                 echo "arr i oder temp ist (bevor) : $temp[$i] <br>";
//                 echo "arr j ist : $arr[$j] <br>";
                $arr[$i]=$arr[$j];
                echo "arr i nachher $arr[$i]<br>";

                $arr[$j]=$temp;
                echo "arr j nachher $arr[$j]<br>";
                
                echo "--------------- <br>";
            }
        else echo "-- i ist $arr[$i] j ist $arr[$j]-- <br>"; 
    }
    return $arr;
}

$arr1=array (6,3,9,4,1);
$sortieren=IntegerRueckwaerts($arr1);
print_r ($sortieren);


?>