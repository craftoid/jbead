/** jbead - http://www.jbead.ch
    Copyright (C) 2001-2012  Damian Brunold

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package ch.jbead.fileformat;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Memento {

    protected String author = "";
    protected String organization = "";
    protected String notes = "";

    protected int width;
    protected int height;
    protected byte[] data;

    protected List<Color> colors = new ArrayList<Color>();
    protected byte colorIndex;
    protected int zoomIndex;
    protected int scroll;
    protected int shift;
    protected String symbols;

    protected boolean draftVisible;
    protected boolean correctedVisible;
    protected boolean simulationVisible;
    protected boolean reportVisible;

    protected boolean drawColors;
    protected boolean drawSymbols;

    protected String selectedTool;

    public abstract void save(JBeadOutputStream out) throws IOException;
    public abstract void load(JBeadInputStream in) throws IOException;

    public byte getMaxSupportedColors() {
        return Byte.MAX_VALUE;
    }

    public boolean compactifyColors() {
        return false;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public byte[] getData() {
        return data;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean isDraftVisible() {
        return draftVisible;
    }

    public boolean isCorrectedVisible() {
        return correctedVisible;
    }

    public boolean isSimulationVisible() {
        return simulationVisible;
    }

    public boolean isReportVisible() {
        return reportVisible;
    }

    public void setDraftVisible(boolean visible) {
        draftVisible = visible;
    }

    public void setCorrectedVisible(boolean visible) {
        correctedVisible = visible;
    }

    public void setSimulationVisible(boolean visible) {
        simulationVisible = visible;
    }

    public void setReportVisible(boolean visible) {
        reportVisible = visible;
    }

    public boolean isDrawColors() {
        return drawColors;
    }

    public boolean isDrawSymbols() {
        return drawSymbols;
    }

    public void setDrawColors(boolean drawColors) {
        this.drawColors = drawColors;
    }

    public void setDrawSymbols(boolean drawSymbols) {
        this.drawSymbols = drawSymbols;
    }

    public List<Color> getColors() {
        return colors;
    }

    public byte getColorIndex() {
        return colorIndex;
    }

    public int getZoomIndex() {
        return zoomIndex;
    }

    public int getShift() {
        return shift;
    }

    public int getScroll() {
        return scroll;
    }

    public String getSymbols() {
        return symbols;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public void setColorIndex(byte colorIndex) {
        this.colorIndex = colorIndex;
    }

    public void setZoomIndex(int zoomIndex) {
        this.zoomIndex = zoomIndex;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setScroll(int scroll) {
        this.scroll = scroll;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSelectedTool() {
        return selectedTool;
    }

    public void setSelectedTool(String selectedTool) {
        this.selectedTool = selectedTool;
    }

}
