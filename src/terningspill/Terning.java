/*
 * Copyright (C) 2016 Arne Hårseth
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package terningspill;
import java.util.Random;

/**
 *
 * @author arne
 */
public class Terning {
    int verdi; // Terningverdien
    // Initier klassevariabel, dvs. variabel global for alle instanser
    // Gjøres for å sikre randomverdi for alle instanser
    final private static Random randomInt=new Random();

    /**
     * Konstruktøren initierer terningen med en tilfeldig verdi
     */
    public Terning () {
        // Initier med tilfeldig verdi
        this.kast();
    }
    
    /**
     * Lag en tilfeldig verdi
     */
    public void kast() {
        verdi= randomInt.nextInt(6)+1;
    }
    
    /**
     *
     * @return  Returnerer ternings verdi
     */
    public int giVerdi() {
        return verdi;
    }
}
