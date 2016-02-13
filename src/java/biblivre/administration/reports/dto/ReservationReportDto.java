/*******************************************************************************
 * Este arquivo é parte do Biblivre4.
 * 
 * Biblivre4 é um software livre; você pode redistribuí-lo e/ou 
 * modificá-lo dentro dos termos da Licença Pública Geral GNU como 
 * publicada pela Fundação do Software Livre (FSF); na versão 3 da 
 * Licença, ou (caso queira) qualquer versão posterior.
 * 
 * Este programa é distribuído na esperança de que possa ser  útil, 
 * mas SEM NENHUMA GARANTIA; nem mesmo a garantia implícita de
 * MERCANTIBILIDADE OU ADEQUAÇÃO PARA UM FIM PARTICULAR. Veja a
 * Licença Pública Geral GNU para maiores detalhes.
 * 
 * Você deve ter recebido uma cópia da Licença Pública Geral GNU junto
 * com este programa, Se não, veja em <http://www.gnu.org/licenses/>.
 * 
 * @author Alberto Wagner <alberto@biblivre.org.br>
 * @author Danniel Willian <danniel@biblivre.org.br>
 ******************************************************************************/
package biblivre.administration.reports.dto;

import java.util.List;

public class ReservationReportDto extends BaseReportDto {

	private List<String[]> biblioReservations;
	private List<String[]> holdingReservations;

	public List<String[]> getBiblioReservations() {
		return this.biblioReservations;
	}

	public void setBiblioReservations(List<String[]> biblioReservations) {
		this.biblioReservations = biblioReservations;
	}

	public List<String[]> getHoldingReservations() {
		return this.holdingReservations;
	}

	public void setHoldingReservations(List<String[]> holdingReservations) {
		this.holdingReservations = holdingReservations;
	}

}
