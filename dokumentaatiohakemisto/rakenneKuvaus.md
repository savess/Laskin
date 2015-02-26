Laskimen rakenne:

Kaikki lähtee käyntiin Laskin projektin laskin.laskin paketin App-luokasta, jossa on main metodi.
Main metodi antaa käyttäjälle ohjeet ja käyttäjä kertoo ohjeitten mukaan tekstikäyttöliittymässä mitä haluaa laskea ja sen mukaan toimitaan.

Jos käyttäjä haluaa laske peruslaskuja käytetään Käyttöliittymät paketissa olevaa Laskin-luokkaa ja Kuuntelija-luokkaa graafisen käyttöliittymän näyttöön ja käyttäjän käskyjen kuunteluun sekä Sovelluslogiikka paketissa olevaa Laskutoimitukset-luokkan metodeja laskujen suoritukseen. Graafinen käyttöliittymä.

Jos käyttäjä haluaa laskea lineaarisen yhtälöparin käytetään Sovelluslogiikka paketissa olevaa LineaarinenYhtalopari-luokkaa ratkomaan käyttäjän antama yhtälöpari. Ei graafista käyttöliittymää.

Jos käyttäjä haluaa ratkoa toisen asteen yhtälön käytetään Sovelluslogiikka paketissa olevaa ToisenAsteenYhtalonRatkaisu-luokkaa ratkomaan käyttäjän antama toisen asteen yhtälö. Ei graafista käyttöliittymää.

Jos käyttäjä haluaa piirtää funktion kuvaajan käytetään Käyttöliittymä paketissa olevaa FunktionKuvaaja-luokkaa. Teksti/Graafinen käyttöliittymä. (Tällä hetkellä vain koordinaatiston piirto haluttuun ikkunan kokoon ja tarkkuuteen toiminnassa)
