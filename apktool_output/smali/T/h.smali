.class public final Lt/h;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:[Ll0/o;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Ln0/L;

.field public final synthetic h:Lp2/n;

.field public final synthetic i:Lp2/n;

.field public final synthetic j:Lt/i;


# direct methods
.method public constructor <init>([Ll0/o;Ljava/util/List;Ln0/L;Lp2/n;Lp2/n;Lt/i;)V
    .locals 0

    iput-object p1, p0, Lt/h;->e:[Ll0/o;

    iput-object p2, p0, Lt/h;->f:Ljava/util/List;

    iput-object p3, p0, Lt/h;->g:Ln0/L;

    iput-object p4, p0, Lt/h;->h:Lp2/n;

    iput-object p5, p0, Lt/h;->i:Lp2/n;

    iput-object p6, p0, Lt/h;->j:Lt/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Ll0/n;

    iget-object v7, p0, Lt/h;->e:[Ll0/o;

    array-length v8, v7

    const/4 v0, 0x0

    move v9, v0

    :goto_0
    if-ge v9, v8, :cond_0

    aget-object v1, v7, v9

    add-int/lit8 v10, v0, 0x1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    invoke-static {v1, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lt/h;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll0/j;

    iget-object v0, p0, Lt/h;->g:Ln0/L;

    invoke-virtual {v0}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v3

    iget-object v0, p0, Lt/h;->h:Lp2/n;

    iget v4, v0, Lp2/n;->d:I

    iget-object v0, p0, Lt/h;->i:Lp2/n;

    iget v5, v0, Lp2/n;->d:I

    iget-object v0, p0, Lt/h;->j:Lt/i;

    iget-object v6, v0, Lt/i;->a:LP/d;

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lt/e;->a(Ll0/n;Ll0/o;Ll0/j;LG0/f;IILP/d;)V

    add-int/lit8 v9, v9, 0x1

    move v0, v10

    goto :goto_0

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
