.class public final LA/z;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ll0/o;

.field public final synthetic g:I


# direct methods
.method public constructor <init>(ILl0/o;I)V
    .locals 0

    iput p1, p0, LA/z;->e:I

    iput-object p2, p0, LA/z;->f:Ll0/o;

    iput p3, p0, LA/z;->g:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Ll0/n;

    iget-object v0, p0, LA/z;->f:Ll0/o;

    iget v1, v0, Ll0/o;->d:I

    iget v2, p0, LA/z;->e:I

    sub-int/2addr v2, v1

    int-to-float v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Lr2/a;->U(F)I

    move-result v1

    iget v3, v0, Ll0/o;->e:I

    iget v4, p0, LA/z;->g:I

    sub-int/2addr v4, v3

    int-to-float v3, v4

    div-float/2addr v3, v2

    invoke-static {v3}, Lr2/a;->U(F)I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Ll0/n;->d(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
