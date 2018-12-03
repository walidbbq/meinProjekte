<?php




// function FreieZimmer ($zimmer,$belegstatus) {
    
   
//     for ($i=0;$i<sizeof($belegstatus);$i++){
        
//                  for ($j=0; $j<sizeof($belegstatus[$i]); $j++) {
                
//                      if ($belegstatus[$i][$j]==false) {
// //                          $bs=$i . $j;
//                          $i=$i;
//                          $j=$j;
//                          echo $i . $j ;
//                          return;
                        
                                         
//                                           }
//                                     }
//     }
// }
                    
                         
function FreieZimmer ($zimmer,$belegstatus) {
    
    $i=0;
    $j=0;
    foreach ($belegstatus as $value ) {
        
        foreach($value as $eintrag) {
            
            
            if ($eintrag == false)
            {
                return ($zimmer[$i][$j]) ;
            }
            $j++;
            
        }
        $i++;
    }
    

}

function LetztesFreieZimmer ($zimmer,$belegstatus) {
    
    $i=count($belegstatus)-1 ;
    
    foreach ($belegstatus as $value ) {
        
        $j=count($value)-1;
        
        foreach($value as $eintrag) {
            
            
            if ($eintrag == false)
            {
                return ($zimmer[$i][$j]) ;
            }
            $j--;
            
        }
        $i--;
    }
    
    
}


function ZwischenZweiFreienZimmer ($zimmer,$belegstatus) {
    
    $i=count($belegstatus);
    
    foreach ($belegstatus as $value ) {
        
        $j=count($value)+2;
        
        foreach($value as $eintrag) {
            
            
            if  ( ($eintrag == false) AND ($eintrag-1==false) AND ($eintrag-2==false) )
            {
                
                return $zimmer[$i][$j+1];
            }
       
                 
                 $j--;
                 
                  }
             $i--;
         }
}



$zimmer = array(
    array(101, 102, 103, 104, 105),
    array(201, 202, 203, 204, 205),
    array(301, 302, 303, 304, 305),
    array(401, 402, 403, 404, 405)
);

$belegstatus = array(
    array(True, False, False, True, True),
    array(False, False, False, True, True),
    array(True, True, True, True, True),
    array(True, False, True, False, True)
);


$freizimmer=FreieZimmer($zimmer, $belegstatus);
echo $freizimmer;

echo "<br>";

$letzteszimmer=LetztesFreieZimmer($zimmer, $belegstatus);
echo $letzteszimmer . "<br>";

$zwischenfreizimmer= ZwischenZweiFreienZimmer($zimmer, $belegstatus);
echo $zwischenfreizimmer . "<br>";

?>