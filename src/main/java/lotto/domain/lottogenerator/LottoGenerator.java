package lotto.domain.lottogenerator;

import lotto.domain.Lotto;

import java.util.Objects;

public abstract class LottoGenerator {
    private LottoGenerator() {
        throw new AssertionError();
    }

    public static Lotto create(LottoGeneratingStrategy strategy) {
        if (Objects.isNull(strategy)) {
            throw new NullPointerException();
        }
        return new Lotto(strategy.generate());
    }
}
