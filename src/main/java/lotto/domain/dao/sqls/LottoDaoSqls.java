package lotto.domain.dao.sqls;

public class LottoDaoSqls {
    public static final String SELECT_ALL_LOTTO_RESULT = "SELECT round.id, name, first, second, third, fourth, fifth, miss, payment " +
            "FROM user " +
            "INNER JOIN round ON round.user_id = user.id " +
            "INNER JOIN payment_info ON payment_info.user_id = user.id " +
            "INNER JOIN lotto_result ON lotto_result.round_id = round.id " +
            "GROUP BY round.id " +
            "LIMIT 10";
    // TODO: 2019-06-12 LIMIT?

}
