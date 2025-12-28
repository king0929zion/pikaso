.class public abstract LB/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv0/q;

    new-instance v1, Lv0/p;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lv0/q;-><init>(Lv0/p;)V

    sput-object v0, LB/a;->a:Lv0/q;

    return-void
.end method

.method public static final a(JLv0/B;LL/a;LD/n;I)V
    .locals 7

    const v0, -0x2aaf331b

    invoke-virtual {p4, v0}, LD/n;->O(I)LD/n;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p4, p0, p1}, LD/n;->e(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p4, p2}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p5, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p4, p3}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-virtual {p4}, LD/n;->y()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p4}, LD/n;->K()V

    goto :goto_5

    :cond_7
    :goto_4
    sget-object v1, LA/O;->a:LD/H;

    invoke-virtual {p4, v1}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv0/B;

    invoke-virtual {v2, p2}, Lv0/B;->c(Lv0/B;)Lv0/B;

    move-result-object v2

    sget-object v3, LA/s;->a:LD/H;

    new-instance v4, LW/r;

    invoke-direct {v4, p0, p1}, LW/r;-><init>(J)V

    invoke-virtual {v3, v4}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v3

    invoke-virtual {v1, v2}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v1

    filled-new-array {v3, v1}, [LD/l0;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const/16 v2, 0x8

    or-int/2addr v0, v2

    invoke-static {v1, p3, p4, v0}, LD/d;->b([LD/l0;LL/a;LD/n;I)V

    :goto_5
    invoke-virtual {p4}, LD/n;->s()LD/n0;

    move-result-object p4

    if-eqz p4, :cond_8

    new-instance v6, LB/c;

    move-object v0, v6

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LB/c;-><init>(JLv0/B;LL/a;I)V

    iput-object v6, p4, LD/n0;->d:Lo2/e;

    :cond_8
    return-void
.end method
