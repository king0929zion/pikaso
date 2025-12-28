.class public final Ln0/W;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# instance fields
.field public final synthetic e:Ln0/Y;

.field public final synthetic f:LP/k;

.field public final synthetic g:Ln0/V;

.field public final synthetic h:J

.field public final synthetic i:Ln0/n;

.field public final synthetic j:Z

.field public final synthetic k:Z


# direct methods
.method public constructor <init>(Ln0/Y;LP/k;Ln0/V;JLn0/n;ZZ)V
    .locals 0

    iput-object p1, p0, Ln0/W;->e:Ln0/Y;

    iput-object p2, p0, Ln0/W;->f:LP/k;

    iput-object p3, p0, Ln0/W;->g:Ln0/V;

    iput-wide p4, p0, Ln0/W;->h:J

    iput-object p6, p0, Ln0/W;->i:Ln0/n;

    iput-boolean p7, p0, Ln0/W;->j:Z

    iput-boolean p8, p0, Ln0/W;->k:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Ln0/W;->g:Ln0/V;

    invoke-virtual {v0}, Ln0/V;->a()I

    move-result v0

    iget-object v1, p0, Ln0/W;->f:LP/k;

    invoke-static {v1, v0}, Ln0/C;->d(Ln0/h;I)LP/k;

    move-result-object v3

    iget-wide v5, p0, Ln0/W;->h:J

    iget-object v7, p0, Ln0/W;->i:Ln0/n;

    iget-object v2, p0, Ln0/W;->e:Ln0/Y;

    iget-object v4, p0, Ln0/W;->g:Ln0/V;

    iget-boolean v8, p0, Ln0/W;->j:Z

    iget-boolean v9, p0, Ln0/W;->k:Z

    invoke-virtual/range {v2 .. v9}, Ln0/Y;->t0(LP/k;Ln0/V;JLn0/n;ZZ)V

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0
.end method
