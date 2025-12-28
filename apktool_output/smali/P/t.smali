.class public interface abstract Lp/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/h;


# virtual methods
.method public a(LB2/i;)Lp/J;
    .locals 0

    new-instance p1, LD1/w;

    invoke-direct {p1, p0}, LD1/w;-><init>(Lp/t;)V

    return-object p1
.end method

.method public abstract b(JFFF)F
.end method

.method public abstract c(JFFF)F
.end method

.method public abstract d(FFF)J
.end method

.method public e(FFF)F
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Lp/t;->d(FFF)J

    move-result-wide v1

    move-object v0, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-interface/range {v0 .. v5}, Lp/t;->c(JFFF)F

    move-result p1

    return p1
.end method
