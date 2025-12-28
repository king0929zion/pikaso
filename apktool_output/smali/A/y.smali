.class public abstract LA/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LA/p;->k:LA/p;

    new-instance v1, LD/T;

    invoke-direct {v1, v0}, LD/T;-><init>(Lo2/a;)V

    return-void
.end method

.method public static final a(LA/o;LA/G;LA/P;LD/n;I)V
    .locals 11

    sget-object v0, LG1/c;->a:LL/a;

    const v1, -0x7ec9fb7e

    invoke-virtual {p3, v1}, LD/n;->O(I)LD/n;

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_0

    or-int/lit8 v1, p4, 0x2

    goto :goto_0

    :cond_0
    move v1, p4

    :goto_0
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_1

    or-int/lit8 v1, v1, 0x10

    :cond_1
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_2

    or-int/lit16 v1, v1, 0x80

    :cond_2
    and-int/lit16 v2, p4, 0xc00

    if-nez v2, :cond_4

    invoke-virtual {p3, v0}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x800

    goto :goto_1

    :cond_3
    const/16 v0, 0x400

    :goto_1
    or-int/2addr v1, v0

    :cond_4
    and-int/lit16 v0, v1, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_6

    invoke-virtual {p3}, LD/n;->y()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p3}, LD/n;->K()V

    goto/16 :goto_5

    :cond_6
    :goto_2
    const/16 v0, -0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p3, v0, v1, v2, v1}, LD/n;->L(ILjava/lang/Object;ILD/j0;)V

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_8

    invoke-virtual {p3}, LD/n;->x()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p3}, LD/n;->K()V

    goto :goto_4

    :cond_8
    :goto_3
    sget-object p0, LA/q;->a:LD/M0;

    invoke-virtual {p3, p0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LA/o;

    sget-object p1, LA/H;->a:LD/M0;

    invoke-virtual {p3, p1}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/G;

    sget-object p2, LA/Q;->a:LD/M0;

    invoke-virtual {p3, p2}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LA/P;

    :goto_4
    invoke-virtual {p3}, LD/n;->r()V

    invoke-static {p3}, LA/D;->a(LD/n;)Lq/C;

    move-result-object v0

    iget-wide v1, p0, LA/o;->a:J

    invoke-virtual {p3, v1, v2}, LD/n;->e(J)Z

    move-result v3

    invoke-virtual {p3}, LD/n;->H()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, LD/l;->a:LD/U;

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, Ly/c;

    const v3, 0x3ecccccd    # 0.4f

    invoke-static {v1, v2, v3}, LW/r;->b(JF)J

    move-result-wide v5

    invoke-direct {v4, v1, v2, v5, v6}, Ly/c;-><init>(JJ)V

    invoke-virtual {p3, v4}, LD/n;->V(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Ly/c;

    sget-object v1, LA/q;->a:LD/M0;

    invoke-virtual {v1, p0}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v5

    sget-object v1, Landroidx/compose/foundation/c;->a:LD/M0;

    invoke-virtual {v1, v0}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v6

    sget-object v0, Lz/z;->a:LD/M0;

    sget-object v1, LA/r;->a:LA/r;

    invoke-virtual {v0, v1}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v7

    sget-object v0, LA/H;->a:LD/M0;

    invoke-virtual {v0, p1}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v8

    sget-object v0, Ly/d;->a:LD/H;

    invoke-virtual {v0, v4}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v9

    sget-object v0, LA/Q;->a:LD/M0;

    invoke-virtual {v0, p2}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v10

    filled-new-array/range {v5 .. v10}, [LD/l0;

    move-result-object v0

    new-instance v1, LA/i;

    invoke-direct {v1, p2}, LA/i;-><init>(LA/P;)V

    const v2, -0x3f9276be

    invoke-static {v2, v1, p3}, LL/b;->b(ILp2/h;LD/n;)LL/a;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p3, v2}, LD/d;->b([LD/l0;LL/a;LD/n;I)V

    :goto_5
    invoke-virtual {p3}, LD/n;->s()LD/n0;

    move-result-object p3

    if-eqz p3, :cond_b

    new-instance v0, LA/x;

    invoke-direct {v0, p0, p1, p2, p4}, LA/x;-><init>(LA/o;LA/G;LA/P;I)V

    iput-object v0, p3, LD/n0;->d:Lo2/e;

    :cond_b
    return-void
.end method
