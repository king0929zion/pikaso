.class public final Lt/g;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:Ll0/o;

.field public final synthetic f:Ll0/j;

.field public final synthetic g:Ln0/L;

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Lt/i;


# direct methods
.method public constructor <init>(Ll0/o;Ll0/j;Ln0/L;IILt/i;)V
    .locals 0

    iput-object p1, p0, Lt/g;->e:Ll0/o;

    iput-object p2, p0, Lt/g;->f:Ll0/j;

    iput-object p3, p0, Lt/g;->g:Ln0/L;

    iput p4, p0, Lt/g;->h:I

    iput p5, p0, Lt/g;->i:I

    iput-object p6, p0, Lt/g;->j:Lt/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v0, p1

    check-cast v0, Ll0/n;

    iget-object p1, p0, Lt/g;->g:Ln0/L;

    invoke-virtual {p1}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v3

    iget-object p1, p0, Lt/g;->j:Lt/i;

    iget-object v6, p1, Lt/i;->a:LP/d;

    iget-object v2, p0, Lt/g;->f:Ll0/j;

    iget-object v1, p0, Lt/g;->e:Ll0/o;

    iget v4, p0, Lt/g;->h:I

    iget v5, p0, Lt/g;->i:I

    invoke-static/range {v0 .. v6}, Lt/e;->a(Ll0/n;Ll0/o;Ll0/j;LG0/f;IILP/d;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
