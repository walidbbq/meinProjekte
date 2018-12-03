<?php

class zimmer {
   public $zimmernummer;
   public $belegstatus;
   
   function __construct($zimmernummer, $belegstatus) {
       $this->zimmernummer=$zimmernummer;
       $this->belegstatus=$belegstatus;
   }
    
   function BelegstatusPruefen () {
       if (!$this->belegstatus)
           echo $this->zimmernummer;
       
   }
   
}


$alleZimmer=array (
    array( new zimmer(101, True), new zimmer(102, False), new zimmer(103, False), new zimmer(104, True), new zimmer(105, True) ),
    array( new zimmer(201, False), new zimmer(202, False), new zimmer(203, False), new zimmer(204, True), new zimmer(205, True) ),
    array( new zimmer(301, True), new zimmer(302, True), new zimmer(303, True), new zimmer(304, True), new zimmer(305, True) ),
    array( new zimmer(401, True), new zimmer(402, False), new zimmer(403, True), new zimmer(404, False), new zimmer(405, True) ),
);



for ($i=0; $i<sizeof($alleZimmer); $i++) {
    for ($j=0; $j<sizeof($alleZimmer[$i]); $j++) {
        if (!$alleZimmer[$i][$j]->belegstatus)
       print_r ($alleZimmer[$j][$j]);
//         print_r( $alleZimmer[$i][$j]);

}
}

// function zimmersuche ($Hotel){
 
//     for ($i=0; $i<sizeof($Hotel); $i++) {
//         for ($j=0; $j<sizeof($Hotel[$i]); $j++) {
//             if ($Hotel[$i][$j] 
            
//         }
        
//     }
// }

// $zm1=zimmersuche($alleZimmer);
// echo $zm1;

// echo zimmersuche($alleZimmer);


// function zimmersuche ($Hotel){
//     foreach ($Hotel as $stock ){
//         foreach ($stock as $key=> $zimmer){
//             if (! $key -> $zimmer)
//                 echo $zimmer;
//         }
//     }
        
// }


// foreach ($alleZimmer as $stock) {
//     foreach($stock as $zm) {
//           $zm ->zimmersuche();
//          return $zm->zimmersuche();
        
//     }
// }

// $zimmer = array(
//     array(101, 102, 103, 104, 105),
//     array(201, 202, 203, 204, 205),
//     array(301, 302, 303, 304, 305),
//     array(401, 402, 403, 404, 405)
// );

// $belegstatus = array(
//     array(True, False, False, True, True),
//     array(False, False, False, True, True),
//     array(True, True, True, True, True),
//     array(True, False, True, False, True)
// );
?>