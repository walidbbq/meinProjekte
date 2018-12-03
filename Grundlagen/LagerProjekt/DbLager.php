<?php
require_once 'artikel.php';
require_once 'adresse.php';
class dblager {
    
   private static $connection;
    
   public static function erstelleVer (){
        $servername='localhost';
        $dbname='dblager';
        $username='root';
        $passwrot='';
        $con=new PDO("mysql:host=$servername;dbname=$dbname",$username,$passwrot);
        dblager::$connection=$con;
    }
    
    public static function artikelLesen() {
        
//         dblager::$con;
        $sql="select * from artikel";
        $artikelTab=dblager::$connection->query($sql);
        $artkArray= array();
        foreach ($artikelTab as $zeille){
            $aid=$zeille['Aid'];  
            $aname=$zeille['Aname'];
            $lpreis=$zeille['Lpreis'];
            $vpreis=$zeille['Vpreis'];
            $lid=$zeille['Lid'];
            $kaid=$zeille['Kaid'];
            $laid=$zeille['Laid'];
            
            $artikel= new artikel($aid, $aname, $lpreis, $vpreis, $lid, $kaid, $laid);
            $artkArray[]=$artikel;
        }
        return $artkArray;
    }
    
    
 
    
//     public function bestellungEintrag($bestellung) {
        
//         $adid=$this->adresseEintrag($bestellung->$kunde->adresse);
        
//         $kid=$this->kundenEintrag($bestellung->kunde,$adid);
        
//         $sql="insert into bestellungen (datum,kid) values
//         ('".$bestellung->datum."','".$kid."')";
//          dblager::$connection->exec($sql);
//          $bid=dblager::$connection->lastInsertId();
//          return $bid;
            
   
//     }



    public static function bestArtkEintrag($bestartk){
        $adid=dblager::adresseEintrag($bestartk->bestellung->kunde->adresse);
        $kid=dblager::kundenEintrag($bestartk->bestellung->kunde, $adid);
        $bid=dblager::bestellungEintrag($kid);
        $sql="insert into best_artk (bid,aid) values 
            ('".$bid."','".$bestartk->artikel->Aid."')";
        dblager::$connection->exec($sql);
    }
    
 
    private function adresseEintrag($adresse){
        $sql="insert into adresse (ort,str,hausnr,plz) values 
            ('".$adresse->ort."','".$adresse->str."','".$adresse->hausnr."','".
            $adresse->plz."')";
        dblager::$connection->exec($sql);
        $adid=dblager::$connection->lastInsertId();
        return $adid;
    }
    
    private function kundenEintrag($kunde,$adid){
        $sql="insert into kunden (kname,knachname,adid) values 
             ('".$kunde->kvorname."','".$kunde->kname."','".
             $adid."')";
        dblager::$connection->exec($sql);
        $kid=dblager::$connection->lastInsertId();
        return $kid;
            
            
    }
    
    private function bestellungEintrag ($kid) {
        $zeit=time();
        $format="Y-m-d";
        $datum=date($format,$zeit);
        $sql="insert into bestellungen (datum,kid) values 
        ('".$datum."','".$kid."')";
        
        dblager::$connection->exec($sql);
        $bid=dblager::$connection->lastInsertId();
        return $bid;
    }
    
    
    private function artikelAuswahl () {
        $sql="select * from artikel";
        $artikelTab=dblager::$connection->query($sql);
        $artkArray= array();
        foreach ($artikelTab as $zeille){
            $aid=$zeille['Aid'];
            $aname=$zeille['Aname'];
            $lpreis=$zeille['Lpreis'];
            $vpreis=$zeille['Vpreis'];
            $lid=$zeille['Lid'];
            $kaid=$zeille['Kaid'];
            $laid=$zeille['Laid'];
            
            $artikel= new artikel($aid, $aname, $lpreis, $vpreis, $lid, $kaid, $laid);
            $artkArray[]=$artikel;
    }
    
    return $artkArray;
    
}

}

// dblager::erstelleVer();
// print_r(dblager::artikelLesen());


?>