package com.example.cybear.prueba.chinchin.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Product implements IProduct {
    private String _s;
    private String _st;
    private String _b;
    private String _q;
    private String _ba;
    private String _qa;
    private float _i;
    private BigDecimal _ts;
    private String _an;
    private String _qn;
    private BigDecimal _o;
    private BigDecimal _h;
    private BigDecimal _l;
    private BigDecimal _c;
    private BigDecimal _v;
    private BigDecimal _qv;
    private int _y;
    private BigDecimal _as;
    private String _pm;
    private String _pn;
    private BigInteger _cs;
    private boolean _etf;

    public Product(@JsonProperty("s") String s,
                   @JsonProperty("st") String st,
                   @JsonProperty("b") String b,
                   @JsonProperty("q") String q,
                   @JsonProperty("ba") String ba,
                   @JsonProperty("qa") String qa,
                   @JsonProperty("i") float i,
                   @JsonProperty("ts") BigDecimal ts,
                   @JsonProperty("an") String an,
                   @JsonProperty("qn") String qn,
                   @JsonProperty("o") BigDecimal o,
                   @JsonProperty("h") BigDecimal h,
                   @JsonProperty("l") BigDecimal l,
                   @JsonProperty("c") BigDecimal c,
                   @JsonProperty("v") BigDecimal v,
                   @JsonProperty("qv") BigDecimal qv,
                   @JsonProperty("y") int y,
                   @JsonProperty("as") BigDecimal as,
                   @JsonProperty("pm") String pm,
                   @JsonProperty("pn") String pn,
                   @JsonProperty("cs") BigInteger cs,
                   @JsonProperty("etf") boolean etf) {
        _s = s;
        _st = st;
        _b = b;
        _q = q;
        _ba = ba;
        _qa = qa;
        _i = i;
        _ts = ts;
        _an = an;
        _qn = qn;
        _o = o;
        _h = h;
        _l = l;
        _c = c;
        _v = v;
        _qv = qv;
        _y = y;
        _as = as;
        _pm = pm;
        _pn = pn;
        _cs = cs;
        _etf = etf;
    }

    public String get_s() {
        return _s;
    }

    public String get_st() {
        return _st;
    }

    public String get_b() {
        return _b;
    }

    public String get_q() {
        return _q;
    }

    public String get_ba() {
        return _ba;
    }

    public String get_qa() {
        return _qa;
    }

    public float get_i() {
        return _i;
    }

    public BigDecimal get_ts() {
        return _ts;
    }

    public String get_an() {
        return _an;
    }

    public String get_qn() {
        return _qn;
    }

    public BigDecimal get_o() {
        return _o;
    }

    public BigDecimal get_h() {
        return _h;
    }

    public BigDecimal get_l() {
        return _l;
    }

    public BigDecimal get_c() {
        return _c;
    }

    public BigDecimal get_v() {
        return _v;
    }

    public BigDecimal get_qv() {
        return _qv;
    }

    public int get_y() {
        return _y;
    }

    public BigDecimal get_as() {
        return _as;
    }

    public String get_pm() {
        return _pm;
    }

    public String get_pn() {
        return _pn;
    }

    public BigInteger get_cs() {
        return _cs;
    }

    public boolean is_etf() {
        return _etf;
    }

    public void set_s(String _s) {
        this._s = _s;
    }

    public void set_st(String _st) {
        this._st = _st;
    }

    public void set_b(String _b) {
        this._b = _b;
    }

    public void set_q(String _q) {
        this._q = _q;
    }

    public void set_ba(String _ba) {
        this._ba = _ba;
    }

    public void set_qa(String _qa) {
        this._qa = _qa;
    }

    public void set_i(float _i) {
        this._i = _i;
    }

    public void set_ts(BigDecimal _ts) {
        this._ts = _ts;
    }

    public void set_an(String _an) {
        this._an = _an;
    }

    public void set_qn(String _qn) {
        this._qn = _qn;
    }

    public void set_o(BigDecimal _o) {
        this._o = _o;
    }

    public void set_h(BigDecimal _h) {
        this._h = _h;
    }

    public void set_l(BigDecimal _l) {
        this._l = _l;
    }

    public void set_c(BigDecimal _c) {
        this._c = _c;
    }

    public void set_v(BigDecimal _v) {
        this._v = _v;
    }

    public void set_qv(BigDecimal _qv) {
        this._qv = _qv;
    }

    public void set_y(int _y) {
        this._y = _y;
    }

    public void set_as(BigDecimal _as) {
        this._as = _as;
    }

    public void set_pm(String _pm) {
        this._pm = _pm;
    }

    public void set_pn(String _pn) {
        this._pn = _pn;
    }

    public void set_cs(BigInteger _cs) {
        this._cs = _cs;
    }

    public void set_etf(boolean _etf) {
        this._etf = _etf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "_s='" + _s + '\'' +
                ", _st='" + _st + '\'' +
                ", _b='" + _b + '\'' +
                ", _q='" + _q + '\'' +
                ", _ba='" + _ba + '\'' +
                ", _qa='" + _qa + '\'' +
                ", _i=" + _i +
                ", _ts=" + _ts +
                ", _an='" + _an + '\'' +
                ", _qn='" + _qn + '\'' +
                ", _o=" + _o +
                ", _h=" + _h +
                ", _l=" + _l +
                ", _c=" + _c +
                ", _v=" + _v +
                ", _qv=" + _qv +
                ", _y=" + _y +
                ", _as=" + _as +
                ", _pm='" + _pm + '\'' +
                ", _pn='" + _pn + '\'' +
                ", _cs=" + _cs +
                ", _etf=" + _etf +
                '}';
    }
}
