.class public final LC2/k;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:LC2/l;

.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LC2/l;

.field public k:I


# direct methods
.method public constructor <init>(LC2/l;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LC2/k;->j:LC2/l;

    invoke-direct {p0, p2}, Li2/c;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LC2/k;->i:Ljava/lang/Object;

    iget p1, p0, LC2/k;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LC2/k;->k:I

    iget-object p1, p0, LC2/k;->j:LC2/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LC2/l;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
