.class public final Lq/o;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/k;


# instance fields
.field public final q:Ls/g;

.field public r:Z

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Ls/g;)V
    .locals 0

    invoke-direct {p0}, LP/k;-><init>()V

    iput-object p1, p0, Lq/o;->q:Ls/g;

    return-void
.end method


# virtual methods
.method public final C(Ln0/B;)V
    .locals 10

    invoke-virtual {p1}, Ln0/B;->a()V

    iget-boolean v0, p0, Lq/o;->r:Z

    iget-object v1, p1, Ln0/B;->d:LY/b;

    if-eqz v0, :cond_0

    sget-wide v2, LW/r;->b:J

    const v0, 0x3e99999a    # 0.3f

    invoke-static {v2, v3, v0}, LW/r;->b(JF)J

    move-result-wide v5

    invoke-interface {v1}, LY/d;->L()J

    move-result-wide v7

    const/16 v9, 0x7a

    move-object v4, p1

    invoke-static/range {v4 .. v9}, LY/d;->r(LY/d;JJI)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lq/o;->s:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lq/o;->t:Z

    if-eqz v0, :cond_2

    :cond_1
    sget-wide v2, LW/r;->b:J

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v2, v3, v0}, LW/r;->b(JF)J

    move-result-wide v5

    invoke-interface {v1}, LY/d;->L()J

    move-result-wide v7

    const/16 v9, 0x7a

    move-object v4, p1

    invoke-static/range {v4 .. v9}, LY/d;->r(LY/d;JJI)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final Y()V
    .locals 5

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v0

    new-instance v1, Lq/n;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lq/n;-><init>(Lq/o;Lg2/d;)V

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v0, v2, v4, v1, v3}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    return-void
.end method
