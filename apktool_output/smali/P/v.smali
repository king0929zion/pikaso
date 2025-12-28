.class public final Lp/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/t;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lp/r;

.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>(IILp/r;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp/v;->a:I

    iput p2, p0, Lp/v;->b:I

    iput-object p3, p0, Lp/v;->c:Lp/r;

    int-to-long v0, p1

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lp/v;->d:J

    int-to-long p1, p2

    mul-long/2addr p1, v2

    iput-wide p1, p0, Lp/v;->e:J

    return-void
.end method


# virtual methods
.method public final b(JFFF)F
    .locals 4

    iget-wide v0, p0, Lp/v;->e:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lp/v;->d:J

    cmp-long p5, v0, v2

    if-gtz p5, :cond_5

    cmp-long p5, p1, v0

    if-gez p5, :cond_0

    move-wide p1, v0

    goto :goto_0

    :cond_0
    cmp-long p5, p1, v2

    if-lez p5, :cond_1

    move-wide p1, v2

    :cond_1
    :goto_0
    iget p5, p0, Lp/v;->a:I

    const/high16 v0, 0x3f800000    # 1.0f

    if-nez p5, :cond_2

    move p1, v0

    goto :goto_1

    :cond_2
    long-to-float p1, p1

    long-to-float p2, v2

    div-float/2addr p1, p2

    :goto_1
    const/4 p2, 0x0

    cmpg-float p5, p1, p2

    if-gez p5, :cond_3

    move p1, p2

    :cond_3
    cmpl-float p2, p1, v0

    if-lez p2, :cond_4

    goto :goto_2

    :cond_4
    move v0, p1

    :goto_2
    iget-object p1, p0, Lp/v;->c:Lp/r;

    invoke-interface {p1, v0}, Lp/r;->a(F)F

    move-result p1

    sget-object p2, Lp/I;->a:LB2/i;

    const/4 p2, 0x1

    int-to-float p2, p2

    sub-float/2addr p2, p1

    mul-float/2addr p2, p3

    mul-float/2addr p4, p1

    add-float/2addr p4, p2

    return p4

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Cannot coerce value to an empty range: maximum "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " is less than minimum 0."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(JFFF)F
    .locals 9

    iget-wide v0, p0, Lp/v;->e:J

    sub-long v0, p1, v0

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Lp/v;->d:J

    cmp-long v6, v2, v4

    if-gtz v6, :cond_4

    cmp-long v6, v0, v2

    if-gez v6, :cond_0

    move-wide v6, v2

    goto :goto_0

    :cond_0
    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    move-wide v6, v4

    goto :goto_0

    :cond_1
    move-wide v6, v0

    :goto_0
    cmp-long v0, v6, v2

    if-gez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    if-nez v0, :cond_3

    return p5

    :cond_3
    const-wide/32 v0, 0xf4240

    sub-long v1, v6, v0

    move-object v0, p0

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lp/v;->b(JFFF)F

    move-result v8

    move-wide v1, v6

    invoke-virtual/range {v0 .. v5}, Lp/v;->b(JFFF)F

    move-result v0

    sub-float/2addr v0, v8

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    return v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot coerce value to an empty range: maximum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " is less than minimum 0."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(FFF)J
    .locals 2

    iget p1, p0, Lp/v;->b:I

    iget p2, p0, Lp/v;->a:I

    add-int/2addr p1, p2

    int-to-long p1, p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method
