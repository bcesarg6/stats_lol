package stats_lol;

import static stats_lol.Stats_lol.lang;

/**
 *
 * @author root
 */
public class Lang {
    public static String selecOption = lng("selecOption");
    static String lng(String l){
        String s = null;
        switch(lang){
            case "pt-BR":
                switch(l){
                    case "selecOption":
                        s = "Selecione sua opção";
                        break;
                    case "seeStats":
                        s = "Estatísticas";
                        break;
                    case "newMatch":
                        s = "Novo jogo";
                        break;
                    case "clearData":
                        s = "Limpar dados";
                        break;
                    case "toolTipStats":
                        s = "Abre uma interface com as opções de estatísticas";
                        break;
                    case "toolTipMatch":
                        s = "Inicia a inserção de um novo jogo";
                        break;
                    case "toolTipClear":
                        s = "Limpa todos os dados criados até agora";
                        break;
                    case "plyStats":
                        s = "Estatísticas dos jogadores";
                        break;
                    case "teamStats": 
                        s = "Estatísticas dos times";
                        break;
                    case "chStats":
                        s = "Estatísticas dos campeões";
                        break;
                    case "scoreTable":
                        s = "Tabela de pontos";
                        break;
                    case "toolTipPly":
                        s = "Abre uma tabela com as estatísticas dos jogadores";
                        break;
                    case "toolTipTeam":
                        s = "Abre uma tabela com as estatísticas dos times";
                        break;
                    case "toolTipCh":
                        s = "Abre uma tabela com as estatísticas dos campeões";
                        break;
                    case "toolTipScore":
                        s = "Abre a tabela de pontos";
                        break;
                    case "player":
                        s = "Jogador";
                        break;
                    case "kda":
                        s = "AMA";
                        break;
                    case "avgFarm":
                        s = "Farm médio";
                        break;
                    case "minFarm":
                        s = "Minions por minuto";
                        break;
                    case "gold":
                        s = "Ouro por partida";
                        break;
                    case "minGold":
                        s = "Ouro por minuto";
                        break;
                    case "killPar":
                        s = "Participação nos abates";
                        break;
                    case "toolTipPlayer":
                        s = "Nome do jogador";
                        break;
                    case "toolTipKDA":
                        s = "(Abates + assistências)/Mortes";
                        break;
                    case "toolTipAvgFarm":
                        s = "Farm total/jogos totais";
                        break;
                    case "tooltipMinFarm":
                        s = "Farm total/tempo total de jogo";
                        break;
                    case "toolTipGold":
                        s = "Ouro total/jogos totais";
                        break;
                    case "toolTipMinGold":
                        s = "Ouro total/tempo total de jogo";
                        break;
                    case "toolTipKillPar":
                        s = "Abates totais do time/(Abates + assistências do jogador)";
                        break;
                    case "team":
                        s = "Time";
                        break;
                    case "avgTurrets":
                        s = "Torres destruídas por jogo";
                        break;
                    case "avgDrag":
                        s = "Dragões abatidos por jogo";
                        break;
                    case "avgBarons":
                        s = "Barões abatidos por jogo";
                        break;
                    case "avgTime":
                        s = "Tempo médio de jogo";
                        break;
                    case "winRatio":
                        s = "Porcentagem de jogos ganhos";
                        break;
                    case "toolTipTm":
                        s = "Nome do time";
                        break;
                    case "toolTipAvgTurrets":
                        s = "Torres totais/jogos totais";
                        break;
                    case "toolTipAvgDrag":
                        s = "Dragões abatidos/jogos totais";
                        break;
                    case "toolTipAvgBarons":
                        s = "Barões abatidos/jogos totais";
                        break;
                    case "toolTipAvgTime":
                        s = "Tempo total de jogo/jogos totais";
                        break;
                    case "toolTipWinRatio":
                        s = "Total de vitórias/jogos totais";
                        break;
                    case "champion":
                        s = "Campeão";
                        break;
                    case "pick":
                        s = "Selecionado";
                        break;
                    case "ban":
                        s = "Banido";
                        break;
                    case "win":
                        s = "Ganhou";
                        break;
                    case "toolTipChampion":
                        s = "Nome do campeão";
                        break;
                    case "toolTipPick":
                        s = "Porcentagem de vezes selecionado";
                        break;
                    case "toolTipBan":
                        s = "Porcentagem de vezes banido";
                        break;
                    case "toolTipWR":
                        s = "Porcentagem de vitórias";
                        break;
                    case "points":
                        s = "Pontos";
                        break;
                    case "games":
                        s = "Jogos";
                        break;
                    case "wins":
                        s = "Vitórias";
                        break;
                    case "ties":
                        s = "Empates";
                        break;
                    case "loses":
                        s = "Derrotas";
                        break;
                    case "totalWins":
                        s = "Vitórias totais";
                        break;
                    case "totalLoses":
                        s = "Derrotas totais";
                        break;
                    case "%":
                        s = "%";
                        break;
                    //case "toolTip"
                                
                }
                break;
            case "en-US":
                break;
            default:
                break;
        }
    return s;
    }   
}
