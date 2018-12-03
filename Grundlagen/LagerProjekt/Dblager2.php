<?php
require_once 'artikel.php';
require_once 'adresse.php';
class dblager2 {
    
    private static $connection;
    
    public static function erstelleVer (){
        $servername='localhost';
        $dbname='dblager';
        $username='root';
        $passwrot='';
        $con=new PDO("mysql:host=$servername;dbname=$dbname",$username,$passwrot);
        dblager2::$connection=$con;
    }
    
    public static function artikelLesen() {
        
        //         dblager::$con;
        $sql="select * from artikel";
        $artikelTab=dblager2::$connection->query($sql);
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
    
    
    public static function  suchen ($suche){
        
        dblager2::erstelleVer();
        $sql="select * From artikel where Aname='".$suche."'";
        $sucheTab=dblager2::$connection->query($sql);
        $arrArtikel=array();
        foreach($sucheTab as $eintrag){
            $aid=$eintrag['Aid'];
            $aname=$eintrag['Aname'];
            $lpreis=$eintrag['Lpreis'];
            $vpreis=$eintrag['Vpreis'];
            $lid=$eintrag['Lid'];
            $kaid=$eintrag['Kaid'];
            $laid=$eintrag['Laid'];
            $ar=new artikel($aid, $aname, $lpreis, $vpreis, $lid, $kaid, $laid);
            $arrArtikel[]=$ar;
        }
        return $arrArtikel;
     
    }
    
    public static function emailUebepruefen ($email) {
        dblager2::erstelleVer();
        $sql="SELECT * FROM kunden WHERE email = '".$email."'";
        $emailTab=dblager2::$connection->query($sql);
        
        $sqlad="select kunden.adid from kunden inner join 
                                        adresse on kunden.adid=adresse.adid
                                        where kunden.email='".$email."'";
//         echo $sqlad."adid1<br>";
            
        $adid=dblager2::$connection->query($sqlad);
       
        
        $adr= new adresse();
        foreach ($adid as $zeille) {
           $adr->adid=$zeille['adid'];
//            echo "aus adr".$adr->adid;
        }
      
        
        $kunde = new kunden();
        $kunde->kid=-1;
        $kunde->adresse=$adr;
        foreach ($emailTab as $zeille) {
               $kunde->email = $zeille['email'];
               $kunde->kid= $zeille['Kid'];
               
             }
         
             return $kunde;

    }
    
    public static function bestArtkEintrag($bestartk){
        $kid=dblager2::kundeKid($bestartk->bestellung->kunde);
        echo $kid;
            if ($kid==-1) {
//                 echo "aus if";
                $adid=dblager2::adresseEintrag($bestartk->bestellung->kunde->adresse);
                $kid=dblager2::kundenEintrag($bestartk->bestellung->kunde, $adid);
            }
        $bid=dblager2::bestellungEintrag($kid);
//         print_r($bestartk->artikel);
            foreach ($bestartk->artikel as $artikel ){
            $sql="insert into best_artk (bid,aid) values
                ('".$bid."','".$artikel->Aid."')";
//             echo $sql;
                dblager2::$connection->exec($sql);
            }
    }
    
    
    private function kundeKid($kunde) {
        $sql="select kid from kunden where email='".$kunde->email."'";
//         echo $sql;
        $tab=dblager2::$connection->query($sql);
        $kid=-1;
        foreach ($tab as $zeille ){
            $kid=$zeille['kid'];
        }
 
        return $kid;
        
    }
    
    
    private function adresseEintrag($adresse){
        $sql="insert into adresse (ort,str,hausnr,plz) values
            ('".$adresse->ort."','".$adresse->str."','".$adresse->hausnr."','".
            $adresse->plz."')";
            echo "<br>" . $sql . "<br>";
            dblager2::$connection->exec($sql);
            $adid=dblager2::$connection->lastInsertId();
            return $adid;
    }
    
    private function kundenEintrag($kunde,$adid){
        $sql="insert into kunden (kname,knachname,adid,email) values
             ('".$kunde->kvorname."','".$kunde->kname."','".
             $adid."','".$kunde->email."')";
        
             echo "<br>" . $sql . "<br>";
             dblager2::$connection->exec($sql);
             $kid=dblager2::$connection->lastInsertId();
             return $kid;
             
             
    }
    
    private function bestellungEintrag ($kid) {
        $zeit=time();
        $format="Y-m-d";
        $datum=date($format,$zeit);
        $sql="insert into bestellungen (datum,kid) values
        ('".$datum."','".$kid."')";
        
        dblager2::$connection->exec($sql);
        $bid=dblager2::$connection->lastInsertId();
        return $bid;
    }
    
    
    private function artikelAuswahl () {
        $sql="select * from artikel";
        $artikelTab=dblager2::$connection->query($sql);
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