.class public final LW/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/L;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LW/L;->a:LW/L;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Paint;I)V
    .locals 0

    invoke-static {p2}, LW/D;->A(I)Landroid/graphics/BlendMode;

    move-result-object p2

    invoke-static {p1, p2}, LW/a;->i(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    return-void
.end method
