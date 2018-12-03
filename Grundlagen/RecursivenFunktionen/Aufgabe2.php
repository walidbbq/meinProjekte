<?php
// echo "===A===";
// function searchForElementInArray($array, $element) {
    
//     $gefunden=false;
//     for ($i=0; $i<sizeof($array);$i++) {
        
//         if ($element == $array[$i]){
//             $gefunden=true;
//             break;
//         }

//      }
     
//      var_dump($gefunden);
// }

// $array=array(1,2,3,"walid");
// searchForElementInArray($array,2);


echo "===B===<b>";

function searchForElementInArrayForeach($array, $element) {
    
    foreach ($array as $value) {
 
        if ($value==$element)
            echo $array[$value];
    }
    
}
$array1=array(1,2,3);
searchForElementInArrayForeach($array1, 3)

?>