package strategies.winningstrategies;

import models.Board;
import models.Move;
import models.Symbol;
import strategies.WinningStrategy;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy {

    // Key :- Column index,  Value:- Actual map with symbol and column index
    private Map<Integer, Map<Symbol, Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

//        if (!counts.containsKey(col)) {
//            counts.put(col, new HashMap<>());
//        }

        Map<Symbol, Integer> colMap = counts.getOrDefault(col, new HashMap<>());
        colMap.put(symbol, colMap.getOrDefault(symbol, 0) + 1);

        // Condition to check for victory
//        if (colMap.get(symbol) == board.getSize()) {
//            return true;
//        }
//
//        return false;

        return colMap.get(symbol) == board.getSize();
    }
}
